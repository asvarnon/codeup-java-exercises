public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(Addition(20, 10));
        System.out.println(Subtraction(20, 10));
        System.out.println(Multiplication(4, 5));
        System.out.println(Division(20, 5));
        System.out.println(Remainder(10, 3));

    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int Division(int num1, int num2) {
        return num1 / num2;
    }

    public static int Remainder(int num1, int num2){
        return num1 % num2;
    }
}
