package codePractice.java10Feature;

public class Local_Variable_Type_Example {

	public static void main(String[] args) {
		var str = "String";
		System.out.println("str -->"+str);
//		Compile time safety is still there
//		Type mismatch: cannot convert from int to String
//		str = 1;
		
//		Polymorhism works here
		var parent = new Parent();
		System.out.println("parent -->"+parent);
		parent = new Child();
		System.out.println("parent -->"+parent);
//		But child class oject can't have Parent instance
//		var child = new Child();
//		child = new Parent();
		
	       var numbers = new int[]{1, 2, 4};
			System.out.println("numbers -->"+numbers);

//	       var [] not allowed in same
//	       var numbers1[] = new int[]{1, 2, 4};

	}
}


class Parent {
	
	int value = 1;
	public Parent() {

		System.out.println("Parent Constructor");
	}
}

class Child extends Parent {
	
	int value = 9;
	
	public Child() {
		System.out.println("Child Constructor");
	}
}