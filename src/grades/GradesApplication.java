package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {



    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("avarnon", new Student("Austin Varnon", 90));
        students.get("avarnon").addGrade(85);
        students.get("avarnon").addGrade(93);


        students.put("bsanger", new Student("Bob Sanger", 80));
        students.get("bsanger").addGrade(73);
        students.get("bsanger").addGrade(100);

        students.put("bjones", new Student("Billy Jones", 65));
        students.get("bjones").addGrade(77);
        students.get("bjones").addGrade(98);

        students.put("griley", new Student("George Riley", 85));
        students.get("griley").addGrade(97);
        students.get("griley").addGrade(94);

        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        //~~~~~~start do/while
        String c = "y";
        do {

            System.out.println("Here are the GitHub usernames of our students:");
            for (String key : students.keySet()){
                System.out.printf("|%s|  ", key);
            }

            System.out.println("Which student would you like more information on?");
            String userInput = scanner.nextLine();
            if (!students.containsKey(userInput)){
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".", userInput);
            } else {
                // TODO: finish the output of student info.
//                System.out.println("Name: %s - Github Username: %s \n Current Average: %d", students);
            }

            System.out.println("Would you like to see another student?");
            c = scanner.nextLine();
            if(!c.equalsIgnoreCase("y")){
                break;
            }

        } while(c.equalsIgnoreCase("y"));

    }
}
