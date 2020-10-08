import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] arrayOfPeople = new Person[3];

        arrayOfPeople[0] = new Person("Austin");
        arrayOfPeople[1] = new Person("Joe");
        arrayOfPeople[2] = new Person("Mark");

        arrayOfPeople = addPerson(arrayOfPeople, new Person("Bill"));
        arrayOfPeople = addPerson(arrayOfPeople, new Person("Billy Bob"));

        System.out.println(Arrays.toString(arrayOfPeople));

        for(Person person : arrayOfPeople){
            person.sayHello();
        }


//        System.out.println("arrayOfPeople[0] = " + arrayOfPeople[0].getName());
//        System.out.println("arrayOfPeople[1] = " + arrayOfPeople[1].getName());
//        System.out.println("arrayOfPeople[2] = " + arrayOfPeople[2].getName());

//        addPerson(arrayOfPeople, new Person("Bill"));
//        System.out.println("arrayOfPeople = " + Arrays.toString(arrayOfPeople));
        

    }

    public static Person[] addPerson(Person[] arrayOfPeople, Person person){
        Person[] copyOfPersons = Arrays.copyOf(arrayOfPeople, arrayOfPeople.length + 1);
        copyOfPersons[arrayOfPeople.length] = person;
        return copyOfPersons;
    }

    

}
