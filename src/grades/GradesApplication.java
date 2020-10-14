package grades;

import util.Input;

import java.util.HashMap;


public class GradesApplication {



    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("avarnon", new Student("Austin Varnon"));
        students.get("avarnon").addGrade(90);
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
        //~~~~~~start do/while
        String c = "y";
        Input input = new Input();
        do {
            System.out.println("Here are the GitHub usernames of our students: ");
            for (String key : students.keySet()){
                System.out.printf("|%s|  ", key);
            }

            System.out.println("\n Which student would you like more information on?");
            String userInput = input.getString();

            if (!students.containsKey(userInput)){
                System.err.printf("Sorry, no student found with the GitHub userInput of \"%s\".\n", userInput);
            } else {
                System.out.printf("Name: %s - Github Username: %s \nCurrent Average: %f\n",
                        students.get(userInput).getName(),
                        userInput,
                        students.get(userInput).getGradeAverage());
            }

            System.out.println("Would you like to see another student? y/n");
            c = input.getString();
            if(!c.equalsIgnoreCase("y")){
                System.out.println("Have a great day!");
                break;
            }

        } while(c.equalsIgnoreCase("y"));

    }
}
