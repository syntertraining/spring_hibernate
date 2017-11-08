package mypkg;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
