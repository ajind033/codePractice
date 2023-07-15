package codePractice.java10Feature;

import java.util.stream.Stream;

public class OptionalEnhancementExample {

	public static void main(String[] args) {
		
		String str1 = Stream.of("Jhon","Ram","Charan","NTR")
				.filter(s->s.contains("T"))
				.findAny().orElseThrow();
		System.out.println("str1 --> "+str1);
		String str2 = Stream.of("Jhon","Ram","Charan","NTR")
				.filter(s->s.contains("2"))
				.findAny().orElseThrow();

//		Will throw error , because all stream elements will be filtered out ,
//		and Optional's orElseThrow will throw
//		Exception in thread "main" java.util.NoSuchElementException: No value present

		System.out.println("str2 --> "+str2);

	}
}
