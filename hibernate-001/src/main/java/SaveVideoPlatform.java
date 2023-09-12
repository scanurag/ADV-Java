import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveVideoPlatform {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Platform p1=new Platform();
	p1.setPid(201);
	p1.setName("youtube");

	Platform p2=new Platform();
	p2.setPid(201);
	p2.setName("ULLo");
	Video v1=new Video();
	v1.setVid(1);
	v1.setTitle("a");
	v1.setDuration(12);
	v1.setP(p2);
	
	
	
	Video v2=new Video();
	v2.setVid(2);
	v2.setTitle("b");
	v2.setDuration(14);
	v2.setP(p2);
	
	
	Video v3=new Video();
	v3.setVid(3);
	v3.setTitle("c");
	v3.setDuration(9);
	v3.setP(p1);
	
	
	Video v4=new Video();
	v4.setVid(4);
	v4.setTitle("g");
	v4.setDuration(34);
	v4.setP(p1);
	
	et.begin();
	em.persist(p1);
	em.persist(p2);
	em.persist(v1);
	em.persist(v2);
	em.persist(v3);
	em.persist(v3);
	et.commit();
	
}
}
