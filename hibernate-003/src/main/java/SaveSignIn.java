import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveSignIn {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	MyKey n=new MyKey();
	n.setEmail("scanurag@gmail.com");
	n.setPhone(723402314);
	
	SingIn s=new SingIn();
	s.setMk(n);
	s.setName("Anurag");
	s.setAge(25);
	s.setPassword("12345");
	
	et.begin();
	em.persist(s);
	et.commit();
}
}
