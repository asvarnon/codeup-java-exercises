package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public String getString(){
        this.scan = new Scanner(System.in);
        System.out.println("Type in a string");
        return scan.nextLine();
    }

    public boolean yesNo(){
        this.scan = new Scanner(System.in);
        System.out.println("Enter a yes or no Value");
        String userInput = scan.nextLine();
        if (userInput.equals("yes") || userInput.equals("y") || userInput.equals("ys") || userInput.equals("yea")){
            return true;
        } else { return false; }

    }

    public int getInt(){
        this.scan = new Scanner(System.in);
        System.out.println("Enter an Integer");
        return scan.nextInt();
    }


    public int getInt(int min, int max){
        int userInput = getInt();
        if (userInput >= max || userInput <= min){
            System.out.println("This is an invalid number outside the range. Try again.");
            return getInt(min, max);
        } else {
            System.out.printf("%s is valid. \n", userInput);
            return userInput;
        }
    }

    public double getDouble(){
        this.scan = new Scanner(System.in);
        System.out.println("Enter a decimal number.");
        return scan.nextDouble();
    }

    public double getDouble(double min, double max){
        double userInput = getDouble();
        if (userInput >= max || userInput <= min){
            System.out.println("This is an invalid number outside the range. Try again.");
            return getDouble(min, max);
        } else {
            System.out.printf("%s is valid.", userInput);
            return userInput;
        }
    }

}

