package module2._10exercises;

public class E15EvenOdd {
	//Exercise 15: Write a program that will print all of the values
	//from 10 to 1 followed by "is even" for the evens and "is odd" for the odds.
    public static void main(String[] args) {
        for(int x = 10; x >= 1; x--){
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            }
            else{
                System.out.println(x + " is odd");
            }
        }

    }
}
