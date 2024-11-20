package dao;

import jakarta.persistence.EntityManager;
import model.AgendamentoPaciente;
import model.DadoPaciente;
import conexao.ConexaoBanco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AgendamentoDAO {

    private AgendamentoPaciente ap;
    private EntityManager em;
    private DadoPaciente dp;

    // Procurar Paciente
    public DadoPaciente getPaciente(int cartao) {
        try {
            em = new ConexaoBanco().getConnection();
            if (em == null || !em.isOpen()) {
                throw new IllegalStateException("EntityManager não foi criado corretamente.");
            }

            dp = em.createNamedQuery("DadoPaciente.findByCartaoPaciente", DadoPaciente.class)
                    .setParameter("cartaoPaciente", cartao)
                    .getSingleResult();  // Retorna o paciente diretamente

            return dp;
        } catch (javax.persistence.NoResultException e) {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println("Erro ao buscar paciente: " + e.getMessage());
        }
        return null; // Retorna null se não encontrar o paciente
    }

    // Agendar paciente
    public void newAgendamento(AgendamentoPaciente agendamento) {
        EntityManager em = null;
        try {
            em = new ConexaoBanco().getConnection();
            if (em == null || !em.isOpen()) {
                throw new IllegalStateException("EntityManager não foi criado corretamente.");
            }

            // Inicia a transação
            em.getTransaction().begin();

            // Busca o agendamento existente pelo cartaoPaciente
            AgendamentoPaciente ap = em.createNamedQuery("AgendamentoPaciente.findByCartaoPaciente", AgendamentoPaciente.class)
                    .setParameter("cartaoPaciente", agendamento.getCartaoPaciente()) // Usando o cartaoPaciente do novo agendamento
                    .getResultList()
                    .stream()
                    .findFirst()
                    .orElse(null); // Retorna o primeiro agendamento encontrado ou null

            if (ap != null) {
                // Atualiza o agendamento existente (merge)
                ap.setDataAgendamento(agendamento.getDataAgendamento());
                ap.setMedico(agendamento.getMedico());
                ap.setMotivo(agendamento.getMotivo());
                ap.setUrgencia(agendamento.getUrgencia());
                ap.setLogradouro(agendamento.getLogradouro());
                ap.setNro(agendamento.getNro());
                ap.setCidade(agendamento.getCidade());
                ap.setNomePaciente(agendamento.getNomePaciente());
                ap.setTelefone(agendamento.getTelefone());
                ap.setCartaoPaciente(agendamento.getCartaoPaciente());
                // O `merge` atualiza o agendamento existente com os novos dados
                em.merge(ap);
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso", "Sucesso", 1);
            } else {
                // Caso não exista, persiste o novo agendamento
                em.persist(agendamento);
                //System.out.println("Novo agendamento persistido...");
            }

            // Commit da transação
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Agendamento Realizado Com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            // Imprime a exceção para maior entendimento
            e.printStackTrace();
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Erro ao agendar paciente: " + e.getMessage());
        } finally {
            // Fechar o EntityManager
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
    }

    public List<AgendamentoPaciente> getAllAgendamento() {
        List<AgendamentoPaciente> lista = new ArrayList<>();
        try {
            // Cria a conexão com o banco (EntityManager)
            em = new ConexaoBanco().getConnection();

            // Verifica se a conexão foi criada corretamente
            if (em == null || !em.isOpen()) {
                throw new IllegalStateException("EntityManager não foi criado corretamente.");
            }

            // Inicia a transação
            em.getTransaction().begin();

            // Executa a consulta nomeada e obtém a lista de pacientes
            lista = em.createNamedQuery("AgendamentoPaciente.findAll", AgendamentoPaciente.class).getResultList();

            // Comita a transação
            em.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, faz o rollback da transação
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Erro: " + e);
        } finally {
            // Fecha o EntityManager após a operação
            if (em != null) {
                em.close();
            }
        }

        return lista;
    }

    // Pesquisar Agendamento
    public AgendamentoPaciente getAgendamento(Integer cartaoPaciente) {
        try {
            em = new ConexaoBanco().getConnection();
            if (em == null || !em.isOpen()) {
                throw new IllegalStateException("EntityManager não foi criado corretamente.");
            }
            dp = getPaciente(cartaoPaciente);
            ap = em.createNamedQuery("AgendamentoPaciente.findByCartaoPaciente", AgendamentoPaciente.class)
                    .setParameter("cartaoPaciente", dp) // Passa o DadoPaciente completo
                    .getSingleResult(); // Retorna o agendamento do paciente
            return ap;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao buscar agendamento: " + e.getMessage());
        } finally {
            if (em != null && em.isOpen()) {
                em.close();  // Fecha a conexão
            }
        }
        return null;
    }

    // Atualizar Agendamento
    public void updateAgendamento(AgendamentoPaciente agendamento) {
        try {
            em = new ConexaoBanco().getConnection();
            if (em == null || !em.isOpen()) {
                throw new IllegalStateException("EntityManager não foi criado corretamente.");
            }

            em.getTransaction().begin();

            // Atualiza diretamente usando a Named Query
            em.createNamedQuery("AgendamentoPaciente.updateMultpleFields")
                    .setParameter("dataAgendamento", agendamento.getDataAgendamento())
                    .setParameter("logradouro", agendamento.getLogradouro())
                    .setParameter("nro", agendamento.getNro())
                    .setParameter("cidade", agendamento.getCidade())
                    .setParameter("medico", agendamento.getMedico())
                    .setParameter("urgencia", agendamento.getUrgencia())
                    .setParameter("motivo", agendamento.getMotivo())
                    .setParameter("telefone", agendamento.getTelefone())
                    .setParameter("nomePaciente", agendamento.getNomePaciente())
                    .setParameter("cartaoPaciente", agendamento.getCartaoPaciente())
                    .executeUpdate();  // Executa a atualização na base de dados

            System.out.println("Atualização feita com sucesso");
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Erro ao atualizar agendamento: " + e.getMessage());
        } finally {
            if (em != null && em.isOpen()) {
                em.close();  // Garante que a conexão seja fechada
            }
        }
    }
}
