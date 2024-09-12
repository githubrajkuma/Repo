package newJavaPackage;

public class EH1 {

	public static void main(String[] args) {

		try {
		int a = 10/0 ;
		System.out.println(a);
		}catch(ArithmeticException b){
			b.printStackTrace();
		System.out.println(b);
		}
	}

}
