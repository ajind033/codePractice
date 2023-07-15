package codePractice.java10Feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java10_Collection_changes {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		System.out.println("list -->"+list);
		System.out.println("list.getClass() -->"+list.getClass());
		List<String> copiedList = List.copyOf(list);
		System.out.println("copiedList -->"+copiedList);
		System.out.println("copiedList.getClass() -->"+copiedList.getClass());
		
		List<String> unModifiedList = Collections.unmodifiableList(list);
		System.out.println("unModifiedList -->"+unModifiedList);
		System.out.println("unModifiedList.getClass() -->"+unModifiedList.getClass());
		
		list.add("xyz0");
		System.out.println("After add in list copiedList -->"+copiedList);
		System.out.println("After add in list unModifiedList -->"+unModifiedList);

		

		Set<String> set = new HashSet<>();
		set.add("abc");
		set.add("def");
		System.out.println("set -->"+set);
		System.out.println("set.getClass() -->"+set.getClass());
		Set<String> copiedListset = Set.copyOf(list);
		System.out.println("copiedListset -->"+copiedListset);
		System.out.println("copiedListset.getClass() -->"+copiedListset.getClass());
		Set<String> copiedSet = Set.copyOf(set);
		System.out.println("copiedSet -->"+copiedSet);
		System.out.println("copiedSet.getClass() -->"+copiedSet.getClass());

		
		Map<String,String> map = new HashMap<>();
		map.put("abc","123");
		map.put("def","456");
		System.out.println("map -->"+map);
		System.out.println("map.getClass() -->"+map.getClass());
		Map<String,String> copiedMap = Map.copyOf(map);
		System.out.println("copiedMap -->"+copiedMap);
		System.out.println("copiedMap.getClass() -->"+copiedMap.getClass());
	
		

	}
}
