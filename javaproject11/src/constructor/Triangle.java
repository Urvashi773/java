package constructor;

public class Triangle extends Shape{
	private int base;
	 private int height;
	 
	  public Triangle(int base, int height) {
		  this.base = base;
		  this.height = height;
		  
	  }
	  public Triangle() {
	  
	  }
	
	
		public int getBase() {
			return base;
		}
		
		public int getHeight() {
			return height;
	}
		public double area() {
			double area = (base * height)/2;
			System.out.println("area of triangle is - " + area);
			return area ;
		
			
		}

}
