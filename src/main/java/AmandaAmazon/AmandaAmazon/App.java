package AmandaAmazon.AmandaAmazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import AmandaAmazon.AmandaAmazon.model.Usuario;

public class App {
	
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		
		Usuario u = new Usuario();
		
		u.setNome("pedro");
		u.setSenha("157");
		u.setEmail ("marialinda.com.br");
		
		
		
		manager.persist(u);
		
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
