import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Engine e=new Engine();
		e.setEid("201");
		e.setCc(0);
	    Bike b=new Bike();
		b.setBid(101);
		b.setName("ktm");
		b.setE(e);
		
		et.begin();
		em.persist(e);
		em.persist(b);
		et.commit();
		
	}
	

}
