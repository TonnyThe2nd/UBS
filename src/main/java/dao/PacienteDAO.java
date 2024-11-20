package dao;

import model.DadoPaciente;
import conexao.ConexaoBanco;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;

public class PacienteDAO {

    private EntityManager em;
    private DadoPaciente p;

    //Novo paciente
    public void novoPaciente(DadoPaciente paciente) {
        em = new ConexaoBanco().getConnection();
        p = em.find(DadoPaciente.class, paciente.getCartaoPaciente());
        try {
            em.getTransaction().begin();
            if (p == null) {
                em.persist(paciente);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Sucesso", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Cartão já cadastrado!", "Erro", 0);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro: " + e);
        } finally {
            em.close();
        }
    }

    // Buscar paciente
    public DadoPaciente pesquisarPacienteCartao(Integer cartao) {
        try {
            em = new ConexaoBanco().getConnection();
            em.getTransaction().begin();
            p = em.find(DadoPaciente.class, cartao);
            if (p == null) {
                JOptionPane.showMessageDialog(null, "Registro não encontrado!", "Erro", 0);
                return null;
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro: " + e);
        } finally {
            em.close();
        }
        return p;
    }

    //Atualizar dados do paciente
    public void atualizarDadosPaciente(DadoPaciente dp) {
        em = new ConexaoBanco().getConnection();
        try {
            em.getTransaction().begin();
            em.createNamedQuery("DadoPaciente.updateMultpleFields")
                    .setParameter("cartaoPaciente", dp.getCartaoPaciente())
                    .setParameter("nome", dp.getNome())
                    .setParameter("telefone", dp.getTelefone())
                    .setParameter("email", dp.getEmail())
                    .setParameter("data_nascimento", dp.getData_nascimento())
                    .setParameter("logradouro", dp.getLogradouro())
                    .setParameter("nro", dp.getNro())
                    .setParameter("cidade", dp.getCidade()).executeUpdate();
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso","Sucesso",1);
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro: " + e);
        } finally {
            em.close();
        }
    }

}
