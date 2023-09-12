import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePerson {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Person p=new Person();
	p.setId(101);
	p.setName("Anurag");
	p.setAge(27);
	p.setGender("M");
	et.begin();
	em.merge(p);
	et.commit();
}
}
