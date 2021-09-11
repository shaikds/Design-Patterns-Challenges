package shai.kds;

public class Director {
    MealBuilder myBuilder;

    public void construct(MealBuilder builder) {
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
