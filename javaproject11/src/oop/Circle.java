package oop;

public class Circle extends Shape {
	private int radius;
	 private static final double PI = 3.14 ;
	
	 
	
	public void setRadius(int radius) {
			this.radius = radius;
			
		}
		public int getRadius() {
			return radius;
		}
		
		public double getPi() {
			return PI;
	    }
		public double area() {
			double area;
			area = PI * radius* radius;
			System.out.println("area of circle is - " + area);
			return area ;
			
			
		}

}