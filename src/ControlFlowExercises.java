import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args) {
//        int i = 2;
//        do {
//            System.out.println(i);
//            i += i;
//        } while (i < 1000000);

//        for (int i = 2; i < 1000000; i += i){
//            System.out.println(i);
//        }

//        ~~~~~~~~~~~~~~~~~~~~~FizzBuzz~~~~~~~~~~~~~~~~~~~~~~~~~

//        for (int i = 1; i <= 100; i++ ) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        System.out.println("Table of Powers");
        Scanner sc = new Scanner(System.in);

        String continuation = "y";

        while (continuation.equalsIgnoreCase("y")) {

            System.out.println("Enter an integer");
            int userInput = sc.nextInt();

            System.out.println("Number" + " | " + "Squared" + " | " + "Cubed");
            System.out.println("------" + " | " + "------" + " | " + "------");

            for (int i = 1; i <= userInput; i++){
                int userInputSQ = (int) Math.pow(i, 2);
                int userInputCB = (int) Math.pow(i, 3);

                String display = i + "         " + userInputSQ + "        " + userInputCB;

                System.out.println(display);

            }
            System.out.println("Would you like to Continue? (y/n)");
            continuation = sc.next();
            System.out.println();
        }
    }
}
