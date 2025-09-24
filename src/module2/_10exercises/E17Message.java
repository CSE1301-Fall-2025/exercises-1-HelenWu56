package module2._10exercises;

public class E17Message {
	//Exercise 17: Write a program so that it prints a string message minus the last character 
    //each time through the loop until there are no more characters in message.   
    //The loop condition should test the length of the message.
    //The loop body should print the message and then use substring to create a new message without the last character.  

    public static void main(String[] args) {
        
        String message = "MODULE2 IS DONE";
        int i = message.length();
        System.out.println(message);

        while (i > 0) {
            message = message.substring(0,i-1);
            System.out.println(message);
            i--;
        }
    }     
}
