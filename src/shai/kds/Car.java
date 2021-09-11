package shai.kds;

public class Car {
    private final String company;
    private final String model;
    private final float price;
    private int wheels;
    private boolean isNew;

    private Car(CarBuilder carBuilder) {
        this.company = carBuilder.company;
        this.model = carBuilder.model;
        this.price = carBuilder.price;
        this.wheels = carBuilder.wheels;
        this.isNew = carBuilder.isNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wheels=" + wheels +
                ", isNew=" + isNew +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isNew() {
        return isNew;
    }

    public static class CarBuilder {
        private final String company;
        private final String model;
        private final float price;
        private int wheels;
        private boolean isNew;

        public CarBuilder(String company, String model, float price) {
            this.company = company;
            this.model = model;
            this.price = price;
        }

        public CarBuilder wheelsNum(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder isNew(boolean isNew) {
            this.isNew = isNew;
            return this;
        }

        public Car build(){
            Car car = new Car(this);
            return car;
        }
    }
}

