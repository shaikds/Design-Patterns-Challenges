package shai.kds;

public interface MealBuilder {

    void buildBurger();

    void buildDrink();

    Meal getMeal();

}

class VegMealBuilder implements MealBuilder {
    private Meal vegMeal = new Meal();



    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());

    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());

    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class ChickenBurgerBuilder implements MealBuilder {
    private Meal chickenBurgerMeal = new Meal();

    @Override
    public void buildBurger() {
        chickenBurgerMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        chickenBurgerMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return chickenBurgerMeal;
    }
}
class KastandowBurgerBuilder implements MealBuilder{
    @Override
    public void buildBurger() {

    }

    @Override
    public void buildDrink() {

    }

    @Override
    public Meal getMeal() {
        return null;
    }
}