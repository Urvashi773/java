package constructor;

public class Cirlce extends Shape {
	private int radius;
	 private static final double PI = 3.14 ;
	
	
	   public Cirlce(int radius) {
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
		public Cirlce() {
			  
		  }
}
