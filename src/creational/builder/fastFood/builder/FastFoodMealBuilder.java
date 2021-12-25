package creational.builder.fastFood.builder;

import creational.builder.fastFood.meal.FastFoodMeal;

public class FastFoodMealBuilder {

    //Mandatory
    private final String side;

    //Optionals
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder forDrink(String drink){
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder forMain(String main){
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder forDessert(String dessert){
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder forGift(String gift){
        this.gift = gift;
        return this;
    }

    public FastFoodMeal build(){
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }
}
