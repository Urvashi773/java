package comparatorAndComparable;

import java.lang.Comparable;
import java.util.Comparator;
public class Employee implements Comparator<Employee> 
{
	public int id;
	public String name;
	public String address;
	public Employee() {
		
	}
	public Employee(int id , String name,String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddess() {
		return address;
	}
	public void setAddess(String addess) {
		this.address = addess;
	}
	@Override
	public String toString() {
		
		return id +" " +name+ " "+ address;
	}
	//@Override
	//public int compareTo(Employee o) {
		//if(this.id==o.id) {
			//return this.name.compareTo(o.name);
		//}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		//return this.id-o.id;
	//}
	
	
	
	
}

