package codePractice.java9Feature;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamEnhancementExample {
	public static void main(String[] args) {
//		takeWhile
		List<Integer> intList1 = Stream.of(2, 0, -2, 4, 5, 6, 7, 8, 9).takeWhile(i -> i % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("takeWhile intList1 -> " + intList1);

//		dropWhile
		List<Integer> intList2 = Stream.of(-1, 1, 7, 3, 4, 5, 6, 7, 8, 9).dropWhile(i -> i % 2 != 0)
				.collect(Collectors.toList());
		System.out.println("dropWhile intList2 -> " + intList2);

//		ofNullable
		Stream<Integer> val1 = Stream.ofNullable(null);
		System.out.println("ofNullable val1 -> " + val1);

		val1.forEach(System.out::println);

		Stream<Integer> val2 = Stream.ofNullable(12);
		System.out.println("ofNullable val2 -> " + val2);
		val2.forEach(System.out::println);

		System.out.println("iterate : ");

		Stream.iterate(1, i -> i < 10, i -> i *= 2).forEach(i -> System.out.print(i + " "));

	}
}
