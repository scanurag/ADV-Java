import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainDriver {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Train t=(Train) ac.getBean("t");
	System.out.println(t);
	Train t1=(Train) ac.getBean("t");
	System.out.println(t1);
}
}
