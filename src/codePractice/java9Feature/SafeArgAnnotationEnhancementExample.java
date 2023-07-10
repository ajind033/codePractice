package codePractice.java9Feature;

public class SafeArgAnnotationEnhancementExample {
	
//  Now until 1.7, we can only use @Safevarargs on final methods, constructors and static methods only.
//	But from 1.9 onwards, we can use this annotation on private instance method also.
	
	@SafeVarargs
	private void display(String...products) {
		for (String prod : products) {
			System.out.println("Prod --> " + prod);
		}
	}
	
	public static void main(String[] args) {
		SafeArgAnnotationEnhancementExample s = new SafeArgAnnotationEnhancementExample();
		s.display("Apple","Orange");
	}
}
