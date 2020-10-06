package oopLec;

public class DishTools {
    public static final int avgCostOfDishInCents = 1300;

    public static void shoutDishName(Dish dish1){
        System.out.println(dish1.nameOfDish.toUpperCase());
    }

    public static void  analyzeDishCost(Dish dish1) {
        if(avgCostOfDishInCents >= dish1.costInCents){
            System.out.println("Less expensive than average");
        } else {
            System.out.println("More exepensive than average");
        }
    }

    public static void flipRecommentation(Dish dish1){
        dish1.wouldRecommend = !dish1.wouldRecommend;
        System.out.println("dish1.wouldRecommend = " + dish1.wouldRecommend);
    }


}
