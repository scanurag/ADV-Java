import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TrainDriver2 {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("spring.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		
		Train t=(Train) bf.getBean("t");
		System.out.println(t);
		
		BeanFactory bf1=new ClassPathXmlApplicationContext("spring.xml");
		Train t1=(Train) bf.getBean("t");
		System.out.println(t1);
		
	}

}
