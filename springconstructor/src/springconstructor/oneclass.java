package springconstructor;

public class oneclass {
	private twoclass twoc;
	/*
	public twoclass getTwoc() {
		return twoc;
	}
	
	public void setTwoc(twoclass twoc) {
		System.out.println("inside setTwoc");
		this.twoc = twoc;
	}
*/
	public oneclass(twoclass twoc){
		this.twoc=twoc;
	}
	public void check(){
		twoc.check();
	}
	
}
