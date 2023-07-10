package codePractice.java9Feature.collectionFatory;

import java.util.Set;

public class SetCollectionFactoryMethodExample {
//Here we can  create <b>unmodifiable Set</b> , but we can <b>not use null </b>as element here,
//	as it will throw NullPointer
//	and duplicate element can not be passed, will throw IllegalArgumentException Exception
	public static void main(String[] args) {
		
		Set<String> s1= Set.of();
		System.out.println("s1 -> "+ s1);
		
		Set<String> s2= Set.of("Hi"," Aman");
		System.out.println("s2 -> "+s2);
		
		Set<String> s3= Set.of("Hi"," aman"," I"," am"," You"," new"," boss"," and", 
				"I"," want"," you"," to"," do"," this" ,"task"," by"," 10 :00 Pm"," sharp.");
		System.out.println("s3 -> "+s3);
		
//		duplicate element can not be passed, will throw IllegalArgumentException Exception
//		Set<String> s4 = Set.of("Hi","Hi"," sharp.");
//		System.out.println("s4 -> "+s4);
		
//		Null element can not be passed, will throw Nullpointer Exception
//		Set<String> s5 = Set.of("Hi",null," sharp.");
//		System.out.println("s5 -> "+s5);
	}
}
