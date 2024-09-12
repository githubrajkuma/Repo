package newJavaPackage;

public class BreakStatement3 {

	public static void main(String[] args) {
       
		int i = 1 ;
		
		while(i<=10) {
			
			if(i==6) {
				break;
			}
			System.out.println(i);
			i++ ;
		}
		System.out.println("control came out from loop");
		
	}
	

}
