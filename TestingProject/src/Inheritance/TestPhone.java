package Inheritance;


public class TestPhone {

	public static void main(String[] args) {
		MobilePhone m = new MobilePhone();
		Phone p = new Phone();
		SmartPhone s = new SmartPhone();
				
		p.call();
		p.voiceMail();
		
		m.call();
		m.voiceMail();
		m.roamFree();
		
		s.call();
		s.voiceMail();
		s.roamFree();
		

	}

}
