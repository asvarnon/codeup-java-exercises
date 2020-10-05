import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(Addition(20, 10));
//        System.out.println(Subtraction(20, 10));
//        System.out.println(Multiplication(4, 5));
//        System.out.println(Division(20, 5));
//        System.out.println(Remainder(10, 3));

//        int userInput = getInteger(1, 10);

        while(true){
            System.out.println("factorial() = " + factorial());
            System.out.println("do you want to continue? y/n");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("n")){
                System.out.println("bye bye");
                break;
            }
        }


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
        System.out.println("Enter a number between " + min + " & " + max);
        if (userInput >= max || userInput <= min){
            System.out.println("Invalid number, try again.");
            return getInteger(min, max);
        }
        System.out.println("You entered a valid number");
        return userInput;
    }

    public static long factorial(){
//        System.out.println("Enter number between 1 & 10");
        int userInput = getInteger(1, 10);
        long output = 1;
        for (int counter = 1; counter <= userInput; counter++){
            output *= counter;
        }
        return output;
    }



}
