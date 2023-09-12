import java.util.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Sim s1=new Sim();
		s1.setSid(101);
		s1.setProvider("JIO");
		s1.setType("4G");
		Sim s2=new Sim();
		s2.setSid(102);
		s2.setProvider("AIRTEL");
		s2.setType("5G");
		List<Sim> sims=new ArrayList<Sim>();
		sims.add(s1);
		sims.add(s2);
		Mobile mi=new Mobile();
		mi.setMid(201);
		mi.setBrand("1+");
		mi.setPrice(2000);
		mi.setSim(sims);
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(mi);
		et.commit();
	}

}
