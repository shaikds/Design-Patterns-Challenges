package shai.kds;

public interface Packing {
    String pack();
}

class Wrapper implements Packing {

    @Override
    public String pack() {
        return ("The Burger Is Wrapped Right Now.");
    }
}

class Bottle implements Packing {

    @Override
    public String pack() {
        return ("The Drink Is Bottled Right Now.");
    }
}
