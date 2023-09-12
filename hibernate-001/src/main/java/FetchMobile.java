import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchMobile {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		

		Query q=em.createQuery("FROM Mobile");
		List<Mobile> mobiles=q.getResultList();
		for(Mobile m: mobiles) {
			System.out.println("mid :"+m.getMid());
			System.out.println("brand :"+m.getBrand());
			System.out.println("price :"+m.getPrice());
			List<Sim> sims=q.getResultList();
			System.out.println(".....................................");
			for(Sim s: sims) {
				System.out.println("sid  :"+s.getSid());
				System.out.println("provider  :"+s.getProvider());
				System.out.println("type  :"+s.getType());
			}
			System.out.println("...............");
			
		}
	}

}
