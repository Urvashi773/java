package oop;

public class Triangle extends Shape {
	private int base;
	 private int height;
	
	 public void setBase(int base) {
			this.base = base;
			
		}
		
		public void setHeight(int height) {
			this.height = height;
			
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
