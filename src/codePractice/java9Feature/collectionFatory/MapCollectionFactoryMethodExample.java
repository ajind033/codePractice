package codePractice.java9Feature.collectionFatory;

import java.util.Map;

public class MapCollectionFactoryMethodExample {
//Here we can  create <b>unmodifiable Map</b> , but we can <b>not use null </b>as key and value here,
//	as it will throw NullPointer
//	and duplicate key can not be passed, will throw IllegalArgumentException Exception
//	but can have duplicate value
	public static void main(String[] args) {
		
		Map<String,String> m1= Map.of();
		System.out.println("m1 -> "+ m1);
		
		Map<String,String> m2= Map.of("Hi"," Aman");
		System.out.println("m2 -> "+m2);
		
		Map<String,String> m3= Map.of("Hi"," aman"," I"," am"," You"," new"," boss"," and", 
				"I"," want"," you"," to"," do"," this" ,"task"," by"," 10 :00 Pm"," sharp.");
		System.out.println("m3 -> "+m3);
		
//		odd number of element can not be passed , hence throwing complie time error : Unresolved compilation problem
//		Map<String,String> m4= Map.of("Hi"," aman"," I");
//		System.out.println("m4 -> "+m4);
		
//		duplicate value can be passed  
		Map<String,String> m5= Map.of("Hi1","21","Hi","21");
		System.out.println("duplicate value can be passed   m5 -> "+m5);
		
//		duplicate key cannot be passed  , IllegalArgumentException exception occur
//		Map<String,String> m6= Map.of("Hi","wq I","Hi"," I");
//		System.out.println("duplicate key can not be passed   m6 -> "+m6);

		
//		null key and value cannot be passed  ,it will throw Nullpointer Exception
//		Map<String,String> m7= Map.of(null,"as","Hi","21");
//		System.out.println("Null key can not  be passed   m7 -> "+m7);

//		Map<String,String> m8= Map.of("we",null,"Hi","21");
//		System.out.println("Null value can not  be passed   m8 -> "+m8);
		
	}
}
