import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveGirlBoy {
public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Girl g=new Girl();
		g.setName("SUNNY");
		
		Boy b1=new Boy();
		g.setName("a");
		b1.setG(g);
		
		Boy b2=new Boy();
		g.setName("b");
		b2.setG(g);
		
		Boy b3=new Boy();
		g.setName("c");
		b3.setG(g);
		
		Boy b4=new Boy();
		g.setName("d");
	
		
		List<Boy> boys=new ArrayList<Boy>();
		boys.add(b1);
		boys.add(b2);
		boys.add(b3);
		
		g.setBoyfriends(boys);
		
		et.begin();
		em.persist(g);
		et.commit();
}
}
