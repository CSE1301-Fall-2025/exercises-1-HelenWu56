package module2._10exercises;

public class E19CountX {
	//Exercise 19: Complete the code below to count the number of
	//"x"s in the String. Use indexOf() with a loop.
    public static void main(String[] args) {
        String message = "xyxxzax";
        int count = 0;
        int index = message.indexOf("x");
        while(index >= 0){
            count++;
            index = message.indexOf("x", index+1);
        }
        System.out.println("Number of x's: " + count);
    }
}
