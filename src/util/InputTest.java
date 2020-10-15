package util;

public class InputTest {



    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Enter a number");
//        userInput.getDouble(userInput.getString());
        userInput.getInt(0, 100);



    }
}
