package conexao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class ConexaoBanco {
    private static final EntityManagerFactory efm = Persistence.createEntityManagerFactory("ubs");
    
    public EntityManager getConnection(){
        return efm.createEntityManager();
    }
}
