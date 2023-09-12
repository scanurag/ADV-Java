import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStateCm {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		State s=em.find(State.class, 1);
		/*CM cm=s.getCm();
		et.begin();
		em.remove(cm);
		em.remove(s);
		et.commit(); ye dono me se delete kar dega */
		CM cm=s.getCm();
		cm.setS(null);
		et.begin();
		em.remove(s);
		et.commit(); 
	}

}
