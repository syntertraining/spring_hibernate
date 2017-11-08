package mypkg;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
public class CustomEventPublisher implements ApplicationEventPublisherAware
{
	ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
	public void publish(){
		CustomEvent ce=new CustomEvent(this);
		publisher.publishEvent(ce);
	}
}
