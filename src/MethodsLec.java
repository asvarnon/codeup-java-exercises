public class MethodsLec {

    public static void main(String[] args) {
//        printer(sayHello("Austin"));
//        printer(sum(2, 3));
//        printer("name: ", "Austin", 26);

//        "austin".lastIndexOf("a");
//        cmd and clicking on a function will show the definition in java.

        count(3);
    }

    public static void printer(String data){
        // "void" does not return a value
        System.out.println("printing strings..." + data);
    }

    public static void count(int n) {
        //recursion, ability for a method to call itself.
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static void printer(int data){
        //can have methods with same name as long as the passed parameter types are different.
        //called Method Overloading
        System.out.println("printing numbers..." + data);
    }

    public static void printer(String prefix, String data, int age){
        // "void" does not return a value
        System.out.println(prefix + "printing strings with prefixes..." + data + age+ "years old");
    }

    public static String sayHello(String name){
        return String.format("Hello, %s!", name);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}

