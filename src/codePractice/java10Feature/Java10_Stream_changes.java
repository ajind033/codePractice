package codePractice.java10Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java10_Stream_changes {

	public static void main(String[] args) {

		List<Integer> list = IntStream.range(1, 10).boxed().collect(Collectors.toUnmodifiableList());
		System.out.println("list ->" + list);
		Set<Integer> set = IntStream.range(1, 10).boxed().collect(Collectors.toUnmodifiableSet());
		System.out.println("set ->" + set);

		Map<Integer, Double> map = IntStream.range(1, 10).boxed()
				.collect(Collectors.toUnmodifiableMap(i -> i, i -> Math.pow(i, 2)));
		System.out.println("map ->" + map);

		Map<Integer, List<String>> mapV2 = Stream.of("abc", "defg", "hij", "klmn")
				.collect(Collectors.toUnmodifiableMap(String::length, List::of, Java10_Stream_changes::mergeMap));
		System.out.println("mapV2 ->" + mapV2);
	}

	static List<String> mergeMap(List<String> l1, List<String> l2) {
		List<String> list = new ArrayList<>();
		list.addAll(l2);
		list.addAll(l1);
		return list;
	}
}
