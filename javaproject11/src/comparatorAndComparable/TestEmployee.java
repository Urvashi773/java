package comparatorAndComparable;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Employee(1,"urvashi","indore"));
		list.add(new Employee(4,"adit","indore"));
		list.add(new Employee(2,"nitisha","bhopal"));
		list.add(new Employee(2,"shreni","rewa"));
		list.add(new Employee(3,"aarushi","khargone"));
		
		//Collections.sort(list);
		//for(Object object:list) {
			//System.out.println(object);
		//}
		
		Collections.sort(list, new OrderById());
		for(Object object:list) {
			System.out.println(object);
		}
	}
	

}
