package codePractice.java9Feature;

abstract class ABC<T> {
	abstract T show(T a, T b);
}

public class AnonymousInnerEnhancementExample {
// Now we can Generics concept in Annnymous innner  class also. Using daimond operator.
	public static void main(String[] args) {
		ABC<String> abc1 = new ABC<>() {
			String show(String a, String b) {
				return a + b;

			}
		};

		System.out.println("abc1.show()  : " + abc1.show("Say", " hello"));

	}
}
