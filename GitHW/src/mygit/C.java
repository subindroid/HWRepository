package mygit;

public class C {
	public static void main(String[] args) {
		System.out.println("Main");
		System.out.println("C.java change in master branch");
		A a = new A();
		a.function_A("cat");
		B b = new B();
		b.function_B("dog");
	}

}
