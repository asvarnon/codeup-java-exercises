import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(Addition(20, 10));
//        System.out.println(Subtraction(20, 10));
//        System.out.println(Multiplication(4, 5));
//        System.out.println(Division(20, 5));
//        System.out.println(Remainder(10, 3));

        System.out.println("Enter a number between 1 and 10.");
        int userInput = getInteger(1, 10);

    }
//    Scanner sc = new Scanner(System.in);


//    public static int Addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int Subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int Multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int Division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int Remainder(int num1, int num2){
//        return num1 % num2;
//    }


    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min){
            System.out.println("Invalid number, try again.");
            return getInteger(min, max);
        }
        System.out.println("You entered a valid number");
        return userInput;
    }

    public static long factorial(int number){
        if (number <= 2){
            System.out.println(number);
            return number;
        }
        System.out.println("past if");
        return number * factorial(number - 1);
    }

}
