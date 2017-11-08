package eventhandlingspring;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("Beans.xml");
		 
	context.start();
	HelloWorld obj=(HelloWorld)context.getBean("helloworld");
	obj.getMessage();
	context.stop();
	}
}
