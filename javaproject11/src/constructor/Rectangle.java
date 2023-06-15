package constructor;

public class Rectangle extends Shape{
	private int length;
	 private int breadth;
	 public Rectangle() {
		 
	 }
	
	 public Rectangle(int length , int breadth) {
		   this.length = length;
		   this.breadth = breadth;}
	 
		   
	
		public int getLength() {
			return length;
		}
		
		public int getBreadth() {
			return breadth;
	}
		public double area() {
			double area = length * breadth;
			System.out.println("area of rectangle is - " + area);
			return area;
			
			
		}

}
