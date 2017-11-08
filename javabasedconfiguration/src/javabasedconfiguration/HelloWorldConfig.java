package javabasedconfiguration;
import org.springframework.context.annotation.*;
@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloworld(){
		return new HelloWorld();
	}
	
	
}
