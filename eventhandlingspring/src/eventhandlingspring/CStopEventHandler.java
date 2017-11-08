package eventhandlingspring;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent>
{

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ContextStoppedEvent Received");
	}

}