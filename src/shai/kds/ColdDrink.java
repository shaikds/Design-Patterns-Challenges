package shai.kds;

public abstract class ColdDrink implements ItemInterface {
    private final Bottle bottle = new Bottle();

    @Override
    public Packing prepare() {
        bottle.pack();
        return bottle;
    }
}

class Coke extends ColdDrink {


    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10;
    }
}

class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5;
    }
}


