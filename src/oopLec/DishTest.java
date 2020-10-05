package oopLec;

import oopLec.Dish;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();

        dish1.costInCents = 99;
        dish1.nameOfDish = "Chicken flavored ramen";
        dish1.wouldRecommend = true;

        dish1.printSummary();
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommentation(dish1);
    }
}
