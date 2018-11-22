package yyd.phoebe.creation.builder;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addTtem(new VegBurger());
        meal.addTtem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addTtem(new ChickenBurger());
        meal.addTtem(new Pepsi());
        return meal;
    }
}
