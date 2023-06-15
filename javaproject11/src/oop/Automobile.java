package oop;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6;
	
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setMake(String make) {
		this.make = make;
		
	}
	
	public String getMake() {
		return make;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	
	public int getSpeed() {
		return speed;
	}
	public void getBreak() {
		if(speed>80) {
			System.err.println("Break Needed");
		}
		else {
			System.out.println("right speed");
		}
	}
	

}
