package mypkg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA=(HelloWorld)context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();
		
		HelloIndia objB=(HelloIndia)context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}

}
