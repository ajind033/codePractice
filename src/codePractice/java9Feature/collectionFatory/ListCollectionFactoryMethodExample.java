package codePractice.java9Feature.collectionFatory;

import java.util.List;
import java.util.Set;

public class ListCollectionFactoryMethodExample {
//Here we can  create <b>unmodifiable List</b> , but we can <b>not use null </b>as element here,
//	as it will throw NullPointer
	public static void main(String[] args) {
		
		List<String> l1= List.of();
		System.out.println("l1 -> "+l1);
		
		List<String> l2= List.of("Hi"," Aman");
		System.out.println("l2 -> "+l2);
		
		List<String> l3= List.of("Hi"," aman"," I"," am"," You"," new"," boss"," and", 
				"I"," want"," you"," to"," do"," this" ,"task"," by"," 10 :00 Pm"," sharp.");
		System.out.println("l3 -> "+l3);
		
		List<String> l4 = List.of("Hi","Hi"," sharp.");
		System.out.println("l4 -> "+l4);
		

//		Null element can not be passed, will throw Nullpointer Exception
//		List<String> l5 = List.of("Hi",null," sharp.");
//		System.out.println("l5 -> "+l5);
	}
}
