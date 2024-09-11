package newJavaPackage;

public class Array4 {

	public static void main(String[] args) {

		int d[][] = { { 1, 3, 4, 5 }, { 7, 8, 9, 10 }, { 11, 12, 13, 14 }, { 17, 18, 19, 20 } };

		// Total number of rows
		int row = d.length;// length is property an array
		System.out.println("Total rows :-" + row);

		// Total number of column
		int column = d[1].length;
		System.out.println("Total columns :-" + column);

		// print all data in matrix form
		// outer loop

		for (int i = 0; i < row; i++) {

			// inner loop
			for (int j = 0; j < column; j++) {

				System.out.print(d[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
