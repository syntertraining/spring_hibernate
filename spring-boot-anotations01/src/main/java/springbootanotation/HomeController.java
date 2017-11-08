package springbootanotation;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;   

@RestController
public class HomeController {
	@RequestMapping(value = "/hello", method={ RequestMethod.POST  })  
	public String hello(){
		return "hello";
	}
	@RequestMapping("sayhi")
	public String sayhi(){
		return "say hi to me ";
	}
}
