import java.util.Scanner;
import static java.lang.Float.parseFloat;


public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of Pi is %d", pi);

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

//        System.out.println("Enter a number");
//        double userInput = sc.nextInt();
//        System.out.printf("The number you entered is %s. \n", userInput);
//
//        System.out.println("What is your name?");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your name is %s %s %s \n", firstName, middleName, lastName);

//        System.out.println("Enter a sentance.");
//        String sentance = sc.nextLine();
//        System.out.printf(sentance);

//        System.out.println("What is the length of the classroom?");
//        double length = sc.nextInt();
//        System.out.println("What is the width of the classroom?");
//        double width = sc.nextInt();

//        System.out.println("What is the length and width of the classroom?");
//        double length = sc.nextInt();
//        double width = sc.nextInt();
//        double height = sc.nextInt();
//        double area = (length * width);
//        double perimeter = (2 * length) + (2 * width);
//        double volume = length * width * height;
//        System.out.printf("The perimeter of the classroom is %.0f units, the area is %.0f units, & the volume is %.0f units.", perimeter, area, volume);

        System.out.println("Enter length, width, and height of the classroom.");
        String userInput = sc.nextLine();
        String[] numbers = userInput.split(" ");
        double length = parseFloat(String.valueOf(numbers[0]));
        double width = parseFloat(String.valueOf(numbers[1]));
        double height = parseFloat(String.valueOf(numbers[2]));
        double area = (length * width);
        double perimeter = (2 * length) + (2 * width);
        double volume = length * width * height;
        System.out.printf("The perimeter of the classroom is %.0f units, the area is %.0f units, & the volume is %.0f units.", perimeter, area, volume);


    }

}
