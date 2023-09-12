import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
	Employee e1=(Employee)ac.getBean("emp");
	System.out.println(e1.name);
	System.out.println(e1.sal);
	Employee e2=(Employee) ac.getBean("emp1");
	System.out.println(e2.name);
	System.out.println(e2.sal);
	
}
}
