package tourofjava.ch2.lab1;

public class Car {

    private String brand, model, color;
    private int enginePower, currentSpeed, maxSpeed, price;

    public Car(String brand, String model, String color, int enginePower, int maxSpeed, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Invalid speed " + speed + " km/s. Keep current speed.");
        } else if (speed < maxSpeed) {
            currentSpeed = speed;
            System.out.println("Set speed to " + speed + " km/s");
        } else {
            currentSpeed = maxSpeed;
            System.out.println("Cannot reach " + speed + " km/s. Set speed to maxSpeed " + maxSpeed + " km/s");
        }
    }

    public double move(double timeInSec) {
        double distance = currentSpeed / 3.6 * timeInSec;
        System.out.println("Move " + distance + " m in " + timeInSec + " s");
        return distance;
    }

    public void honk() {
        System.out.println("DiDi...");
    }

    public void introduce() {
        System.out.println("I'm a/an " + color + " " + brand + " " + model);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        var myCar = new Car("BMW", "X7", "Black", 250, 245, 1_000_000);
        myCar.introduce();
        myCar.honk();
        myCar.setSpeed(100);
        myCar.move(600);
    }
}
