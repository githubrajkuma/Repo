package newJavaPackage;

public class BreakStatement2 {

	public static void main(String[] args) {
		
        //outer loop
		for (int a =1 ;a<3 ;a++) {
			
			//inner loop 
			for(int b =1 ;b<3 ;b++) {
				
				if(a==2 && b==2) {
					break;
				}
				System.out.println(a + "  " +b);
				
			}
			
			System.out.println("Control came out from loop");
		}
		System.out.println("Add new line ");
	}

}
