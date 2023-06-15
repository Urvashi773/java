package oop;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.setColor("Black");
		System.out.println("Color is - " + a.getColor());
		a.setMake("TATA");
		System.out.println("company name is - " + a.getMake() );
		a.setSpeed(90);
		System.out.println("Speed is - " + a.getSpeed() );
		a.getBreak();
	}

}
