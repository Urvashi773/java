package comparatorAndComparable;

import java.util.Comparator;

public class OrderById implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		
		return o1.id - o2.id;
	}
	

}
