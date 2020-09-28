public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 26;

        String myString = "This is my age.";
        myString = "3.14159";

        float myNumberTwo = (float) 3.14;
        double myNumber = 3.14;
//        System.out.println(myNumber);
        //why when I use float, does it have me cast float again?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //Does not work because int declares obj o as a number type but it is a string.

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = Integer.MAX_VALUE + 1;
//      int y = 2;
//      x /= y;
//      y -= x;

//      If it goes outside the container parameters, it circles back to the min amount.
//      System.out.println(y);
        System.out.println(x);

    }
}
