package model;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	protected EntityManager entityManager;	
	public DAO(){
		  entityManager = getEntityManager();
	}
	private EntityManager getEntityManager() {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistencia");
			if(entityManager==null)
				entityManager = factory.createEntityManager();
			
			return entityManager;
	}
}	

