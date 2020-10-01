import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
//        long i = 2;
//        do {
//            System.out.println(i);
//            i += i;
//        } while (i < 1000000L);

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


//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Table of powers~~~~~~~~~~~~~~~~~~~~
//        System.out.println("Table of Powers");
//        Scanner sc = new Scanner(System.in);
//
//        String continuation = "y";
//
//        while (continuation.equalsIgnoreCase("y")) {
//
//            System.out.println("Enter an integer");
//            int userInput = sc.nextInt();
//
//            System.out.println("Number" + " | " + "Squared" + " | " + "Cubed");
//            System.out.println("------" + " | " + "------" + " | " + "------");
//
//            for (int i = 1; i <= userInput; i++){
//                int userInputSQ = (int) Math.pow(i, 2);
//                int userInputCB = (int) Math.pow(i, 3);
//
//                String display = i + "         " + userInputSQ + "        " + userInputCB;
//
//                System.out.println(display);
//
//            }
//            System.out.println("Would you like to Continue? (y/n)");
//            continuation = sc.next();
//            System.out.println();
//        }

//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Grades~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        System.out.println("Grade Conversion");
        Scanner sc = new Scanner(System.in);
        String continuation = "y";

        do {
            System.out.println("Please enter your number grade:");
            int userGrade = sc.nextInt();

//            String a = "A";
//            String b = "B";
//            String c = "C";
//            String d = "D";
//            String f = "F";

            if (userGrade <= 100 && userGrade >= 88) {
                System.out.println("Your letter grade is: A");
            } else if (userGrade < 87 && userGrade >= 80) {
                System.out.println("Your letter grade is: B");
            } else if (userGrade <= 79 && userGrade >= 67) {
                System.out.println("Your letter grade is: C");
            } else if (userGrade <= 66 && userGrade >= 60) {
                System.out.println("Your letter grade is: D");
            } else if (userGrade < 60) {
                System.out.println("Your letter grade is: F");
            }

            System.out.print("Would you like to Continue? (y/n): ");
            continuation = sc.next();
            System.out.println();

        } while (!continuation.equalsIgnoreCase("n"));
    }
}
