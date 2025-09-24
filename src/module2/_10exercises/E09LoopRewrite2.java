package module2._10exercises;

public class E09LoopRewrite2 {
	
	//Exercise 9: Rewrite the following to use a for loop
	//instead of a while loop
    public static void main(String[] args) {
        int x = 5;
        while (x <= 15) {
            System.out.println(x);
            x = x + 1;
        }

        for(int y = 5; y<=15; y++){
            System.out.println(y);
        }
    }
}
