package codePractice.java9Feature;

// Now we can have private method in Interface also. Which can be used for by defalut methods for having common code.
interface PrivateInterfaceExample {

	private void saySomething() {
		System.out.println("Say Somethings");

	}

	private  static void saySomethingStatic() {
		System.out.println("Say Somethings static");

	}

	default void sayHi() {

		System.out.println("Hi");
		saySomething();
		saySomethingStatic();
	}

	default void sayLo() {

		System.out.println("Lo");
		saySomething();
		saySomethingStatic();

	}
}

public class PrivateInterfaceExampleImpl implements PrivateInterfaceExample {

	public static void main(String[] args) {
		PrivateInterfaceExample p = new PrivateInterfaceExampleImpl();
		p.sayHi();
		p.sayLo();

	}
}
