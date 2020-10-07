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


    }
}

