package oop;

public class Rectangle extends Shape {
	private int length;
	 private int breadth;
	
	 public void setLength(int length) {
			this.length = length;
			
		}
		public int getLength() {
			return length;
		}
		public void setBreadth(int breadth) {
			this.breadth = breadth;
			
		}
		public int getBreadth() {
			return breadth;
	}
		public double area() {
			double area = length * breadth;
			System.out.println("area of rectangle is - " + area);
			return area ;
			
			
		}
		

}
