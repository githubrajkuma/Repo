package newJavaPackage;

public class Array3 {

	static int a[] = { 20, 25, 10, 15 };

	public static void passingArrayToMehod(int a[]) {

		int c = a[1];

		System.out.println(c);// 25

		for (int i = 0; i < a.length; i++) {

			if (c >= a[i]) {

				System.out.println(c);
			} else {

				System.out.println("ABCD");
			}
		}

	}

	public static void main(String[] args) {
		passingArrayToMehod(a);
	}

}
