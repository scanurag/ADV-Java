import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Book b=(Book) ac.getBean("b");
		System.out.println(b.getType());
		System.out.println(b.getPrice());
	}

}
