package javabasedconfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloworld=ctx.getBean(HelloWorld.class);
		helloworld.setMessage("welcome to spring");
		helloworld.getMessage();
	}

}
