import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindStateCm {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	State s=em.find(State.class, 1);
	int no=s.getNo();
	String name=s.getName();
	String capital=s.getCapital();
	CM cm=s.getCm();
	String cmname=cm.getName();
	int age=cm.getAge();
	String qualification=cm.getQualification();
	System.out.println(".................state details.........................");
	System.out.println(no);
	System.out.println(name);
	System.out.println(capital);
	System.out.println(".................cm details.........................");
	System.out.println(cmname);
	System.out.println(age);
	System.out.println(qualification);
	  
}

}
