package Inheritance;

public class MobilePhone extends Phone {
	
	public void roamFree(){
		System.out.println("In roamFree function of MobilePhone");
	}
	
	@Override
	public void call(){
		System.out.println("In call function of MobilePhone class");
	}
}
