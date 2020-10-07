import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLec {
    
    public static void main(String[] args) {
        
        double[] prices = new double[3];
        //have to declare the amount of spaces as well as datatype.
        
        prices[0] = Double.parseDouble("1.0");
        prices[1] = 2.0 * 2;
        prices[2] = 3.0;

//        System.out.println("prices[0] = " + prices[0]);
//        System.out.println("prices[2] = " + prices[2]);

        String[] names = {"Austin", "Fer", "Douglas", "Daniel"};

//        System.out.println(names[0]);
//        System.out.println(names[2]);
        
//        for(int i = 0;i < names.length; i++){
//            System.out.println("names[i] = " + names[i]);
//        }
        
//        for(String name : names){
//            System.out.println("name = " + name);
//        }

//        Arrays.sort(prices);
//        Arrays.sort(names);
//        System.out.println("Arrays.toString(prices) = " + Arrays.toString(prices));
//        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        String[] copyOfNames = Arrays.copyOf(names, names.length + 1);
        copyOfNames[3] = "Joe";
//        System.out.println("Arrays.toString(copyOfNames) = " + Arrays.toString(copyOfNames));

        int[] numbers = new int[8];
        int[] otherNumbers = new int[8];
//        Arrays.fill(numbers, 10);
//        Arrays.fill(otherNumbers, 5);
//        System.out.println("Arrays.equals(otherNumbers, otherNumbers) = " + Arrays.equals(otherNumbers, otherNumbers));
//        System.out.println("Arrays.equals(otherNumbers, numbers) = " + Arrays.equals(otherNumbers, numbers));
//        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));


        //~~~~~~~~ matrix~~~~~~~~~~
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//// access the first element in the second row
//        System.out.println(matrix[1][0]); // 4
//// the last element in the first row
//        System.out.println(matrix[0][2]); // 3
//// the first element in the last row
//        System.out.println(matrix[2][0]); // 7
//
//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (int cell : row) {
//                System.out.print(cell + " | ");
//            }
//
//            System.out.println();
//        }

        //~~~~~~~~~~Array of objects~~~~~~~~~~
        //using previous person class
        Person[] persons = new Person[2];
        persons[0] = new Person("Austin");
        persons[1] = new Person("Joe");

        for (Person person : persons) {
            person.sayHello();
            System.out.println("Hi " + person.getName() + ", welcome to my world!");
        }


    }
}

