package dao;

import model.DadoFuncionario;
import conexao.ConexaoBanco;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;
import view.FrameSecretaria;

public class FuncionarioDAO {

    private DadoFuncionario df;
    private EntityManager em;

    // Cadastrar novo funcionário
    public void novoFuncionario(DadoFuncionario dados) {
        em = new ConexaoBanco().getConnection();
        try {
            df = em.find(DadoFuncionario.class, dados.getCpf());
            em.getTransaction().begin();
            if (df == null) {
                em.persist(dados);
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Sucesso", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário já cadastrado!", "Erro", 0);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro: " + e);
        } finally {
            em.close();
        }
    }

    // Buscar funcionário
    public DadoFuncionario pesquisarFuncionarioCPF(String cpf) {
        try {
            em = new ConexaoBanco().getConnection();
            em.getTransaction().begin();
            df = em.find(DadoFuncionario.class, cpf);
            if (df == null) {
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
        return df;
    }

    // Atualizar dados de funcionários
    public void atualizarFuncionario(DadoFuncionario dados) {
        try {
            em = new ConexaoBanco().getConnection();
            em.getTransaction().begin();
            em.createNamedQuery("DadoFuncionario.updateMultipleFields")
                    .setParameter("cpf", dados.getCpf())
                    .setParameter("nome", dados.getNome())
                    .setParameter("email", dados.getEmail())
                    .setParameter("logradouro", dados.getLogradouro())
                    .setParameter("nro", dados.getNro())
                    .setParameter("cidade", dados.getCidade())
                    .setParameter("dataNascimento", dados.getDataNascimento())
                    .setParameter("funcao", dados.getFuncao())
                    .setParameter("telefone", dados.getTelefone()).executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso", "Sucesso", 1);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!", "Erro", 0);
                em.getTransaction().rollback();
            }
            System.out.println("Erro: " + e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    // Login funcionario
    public boolean login = false;

    public String loginFuncionario(String email, String senha) {
        try {
            em = new ConexaoBanco().getConnection();
            em.getTransaction().begin();
            df = (DadoFuncionario) em.createNamedQuery("DadoFuncionario.findByEmailAndSenha")
                    .setParameter("email", email)
                    .setParameter("senha", senha).getSingleResult();
            if (df.getFuncao().equals("Secretário")) {
                FrameSecretaria fs = new FrameSecretaria(df.getNome());
                fs.setVisible(true);
                login = true;
            }
            em.getTransaction().commit();
            return df.getNome();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "E-mail e/ou Senha incorretos!", "Erro", 0);
            em.getTransaction().rollback();
            System.out.println("Erro: " + e);
        } finally {
            em.close();
        }
        return "";
    }

}
