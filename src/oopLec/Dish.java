package oopLec;

public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %d cents\nName: %s \nRecommended: %b \n", costInCents, nameOfDish, wouldRecommend);
    }
}
