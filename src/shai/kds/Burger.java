package shai.kds;

public abstract class Burger implements ItemInterface {

    @Override
    public Packing prepare() {
        Wrapper wrapper = new Wrapper();
        wrapper.pack();
        return wrapper;
    }
}

class VegBurger extends Burger {

    @Override
    public String name() {
        return "Vegetarian Burger";
    }

    @Override
    public float price() {
        return 30;
    }

}

class ChickenBurger extends Burger {


    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 20;
    }

}
