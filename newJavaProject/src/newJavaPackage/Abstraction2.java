package newJavaPackage;

public class Abstraction2 extends Abstraction1 {

	void a() {

	}

	public static void main(String[] args) {
		d();
		System.out.println(s);

		Abstraction2 a2 = new Abstraction2();
		a2.a();
		// a2.d();
		System.out.println(a2.a);
		System.out.println(a2.f);
		// System.out.println(a2.s);
	}

}
