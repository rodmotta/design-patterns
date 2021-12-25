package creational.builder.fastFood.client;

import creational.builder.fastFood.meal.FastFoodMeal;
import creational.builder.fastFood.builder.FastFoodMealBuilder;

public class Client {
    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
                .forMain("ChesseBurguer")
                .forDrink("Coke")
                .build();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries").build();
        System.out.println(justFries);

        FastFoodMeal hearAtackCombo = new FastFoodMealBuilder("Large Fries")
                .forMain("Monster Burguer")
                .forDrink("Milk Shake")
                .forDessert("Fudge Cake")
                .forGift("2 kilograms")
                .build();
        System.out.println(hearAtackCombo);
    }
}
