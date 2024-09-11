package newJavaPackage;

public class Array1 {

	public static void main(String[] args) {

		//Defining an array
		int a[] = new  int[10] ;
		
		//Printing the length of an array
		System.out.println(a.length);//10
		
		//Printing the default value of an array using for loop
		
		for(int i = 0 ;i <a.length ; i++) {
			
			System.out.println(i);
			
		}
		
		//Assigning value to an array
		
		a[0]=20 ;
		a[1]=30;
		a[2]=40;
		a[3]=12;
		a[4]=13;
		a[5]=14;
		a[6]=15;
		
		// ArrayIndexOutofBoundExeption
		//a[11]=16 ;
		
		System.out.println(a[2]);//40
		System.out.println(a[5]);//14
		//System.out.println(a[11]);//java.lang.ArrayIndexOutOfBoundsException
		
		//Printing all value of an array
		for(int i =0 ;i<a.length ;i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
