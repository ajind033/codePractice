package codePractice.java9Feature.collectionFatory;

import java.util.Map;

public class MapOfEntryCollectionFactoryMethodExample {
//Here we can  create <b>unmodifiable Map</b> , but we can <b>not use null </b>as key and value here,
//	as it will throw NullPointer
//	and duplicate key can not be passed, will throw IllegalArgumentException Exception
//	but can have duplicate value
	public static void main(String[] args) {

		Map<String, String> m1 = Map.ofEntries();
		System.out.println("m1 -> " + m1);

		Map<String, String> m2 = Map.ofEntries(Map.entry("ke", "va"));
		System.out.println("m2 -> " + m2);

		Map<String, String> m3 = Map.ofEntries(Map.entry("ke1", "va1"), Map.entry("ke2", "va2"),
				Map.entry("ke3", "va3"));
		System.out.println("m3 -> " + m3);


//		duplicate value can be passed  
		Map<String, String> m5 = Map.ofEntries(Map.entry("ke1", "va2"), Map.entry("ke2", "va2"));
		System.out.println("duplicate value can be passed   m5 -> " + m5);

//		duplicate key cannot be passed  , IllegalArgumentException exception occur
//		Map<String,String> m6= Map.ofEntries(Map.entry("ke2", "va2"), Map.entry("ke2", "va2"));
//		System.out.println("duplicate key can not be passed   m6 -> "+m6);

//		null key and value cannot be passed  ,it will throw Nullpointer Exception
//		Map<String,String> m7= Map.ofEntries(Map.entry("ke1", null), Map.entry("ke2", "va2"));
//		System.out.println("Null value can not  be passed   m7 -> "+m7);

//		Map<String,String> m8= Map.ofEntries(Map.entry(null, "va1"), Map.entry("ke2", "va2"));
//		System.out.println("Null key can not  be passed   m8 -> "+m8);

	}
}
