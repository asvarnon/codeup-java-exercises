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

        for (int i = 1; i <= 100; i++ ) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
