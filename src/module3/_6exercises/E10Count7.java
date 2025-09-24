package module3._6exercises;

public class E10Count7 {

	//Exercise 10: Complete the given code to count the number of 7's
	//in the 2D array. Add another row to the array and retest your code.
	public static void main(String[] args) {
		int[][] array = { {4,7,8},{8,8,7},{7,7,7}};

		//ADD CODE HERE
		int count = 0;
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++){
				if(array[i][j] == 7){
					count++;
				}
			}
		}		
		System.out.println("Number of 7's: " + count);

	}
}

