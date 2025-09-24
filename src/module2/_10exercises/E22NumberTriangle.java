package module2._10exercises;

public class E22NumberTriangle {
	//Exercise 22: Complete the program below to print:
	
	//55555
	//4444
	//333
	//22
	//1
	//Use loops to accomplish this!
	
    public static void main(String[] args) {
		for(int x = 5; x >= 1; x--){
			 for (int y = 0; y < x; y++) {
                System.out.print(x);
            }
            System.out.println();
		}
    }
}
