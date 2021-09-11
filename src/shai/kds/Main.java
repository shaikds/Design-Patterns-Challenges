package shai.kds;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("***** // Builder Pattern Demo // ******");
        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new ChickenBurgerBuilder();

        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        //veg meal builder
        System.out.println("\nVegetarian Meal\n");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        System.out.println("\nNon Vegetarian meal\n");
        nonVegMeal.showItems();
        System.out.println("Total Cost : " + nonVegMeal.getCost());


        //Other Approach For Builder Pattern
        System.out.println("\n-------Other Approach For Builder Pattern---------\n");
        Car car = new Car.CarBuilder("Honda", "civic", 3000).isNew(false).wheelsNum(2).build();
        System.out.println(car.toString());

        Car car2 = new Car.CarBuilder("Mazda", "3", 5000).wheelsNum(4).build();
        System.out.println(car2.toString());
    }
}
