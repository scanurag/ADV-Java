import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStateCM {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		State s=new State();
		  
		
		
		CM cm=new CM();
		s.setName("UP");
		s.setCapital("Lucknow");
		s.setNo(1);
		s.setCm(cm);
		cm.setName("Anurag");
		cm.setAge(24);
		cm.setQualification("CSE");
		cm.setS(s);
		
		
		
		et.begin();
		em.persist(s);
		em.persist(cm);
		et.commit();
	}

}
