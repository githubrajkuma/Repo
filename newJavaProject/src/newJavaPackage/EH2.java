package newJavaPackage;

public class EH2 {

	public static void main(String[] args) {

		try {
			int a[] = { 1, 2, 3, 4, 5 };

			System.out.println(a[5]);
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		System.out.println("The exception handled");
	}

}
