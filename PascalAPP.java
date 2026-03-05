package week7;

public class PascalAPP {

	// This program prints rows 0 through 10 of Pascal's triangle using arrays.
	
	public static void main(String[] args) throws InterruptedException {
	
		// Tell the user what the program does:
		System.out.println("This program prints rows 0 through 10 of Pascal's triangle:");
		
		// Create the array:
		int[][] pascalTriangle = new int[11][11]; 
		
		
		// Fill the array:
		// Set the first value and print it:
		pascalTriangle[0][0] = 1;
		System.out.println("\n" + pascalTriangle[0][0]);
		
		// Compute and print the remaining values:
		int row, col, num1, num2;
		for (row = 1; row < 11; row++) {
			for (col = 0; col < 11; col++) {
				// Handle errors resulting from negative index numbers
				// and assign the values of num1 and num2:
				if (col-1 < 0) {
					num1 = 0;}
				else {
					num1 = pascalTriangle[row-1][col-1];}
					num2 = pascalTriangle[row-1][col];
				
				// Add num1 and num2 to get the value for Pascal's Triangle and assign it:
				int value = num1 + num2;
				pascalTriangle[row][col] = value;
				
				// Print the value:
				if (value != 0) {
					Thread.sleep(100);
					System.out.format("%-3d ", value);}
			}
			System.out.println("");
		}
		
		
		// Tell the user the program has ended:
		System.out.println("\nProgram ended.");

	}

}
