package mypkg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	     te.spellCheck();
	}

}
