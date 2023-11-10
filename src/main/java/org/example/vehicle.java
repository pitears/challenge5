package org.example;

class Vehicle {
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public void moveForward() {
        System.out.println("Vehicle is moving forward.");
    }

    public void turn() {
        System.out.println("Vehicle is turning.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private int fuelCapacity;

    public Car(int wheels, int numberOfDoors, int fuelCapacity) {
        super(wheels);
        this.numberOfDoors = numberOfDoors;
        this.fuelCapacity = fuelCapacity;
    }

    public void shiftGear() {
        System.out.println("Car is shifting gears.");
    }

    @Override
    public void turn() {
        System.out.println("Car is turning smoothly.");
    }
}

class HondaJazz extends Car {
    private String model;

    public HondaJazz(int numberOfDoors, int fuelCapacity, String model) {
        super(4, numberOfDoors, fuelCapacity);
        this.model = model;
    }

    public void playMusic() {
        System.out.println("Honda Jazz is playing music.");
    }
}

class ToyotaFortuner extends Car {
    private boolean offRoadCapability;

    public ToyotaFortuner(int numberOfDoors, int fuelCapacity, boolean offRoadCapability) {
        super(4, numberOfDoors, fuelCapacity);
        this.offRoadCapability = offRoadCapability;
    }

    @Override
    public void moveForward() {
        System.out.println("Toyota Fortuner is moving forward with off-road capability.");
    }
}

class SuzukiKatana extends Car {
    private boolean isConvertible;

    public SuzukiKatana(int numberOfDoors, int fuelCapacity, boolean isConvertible) {
        super(4, numberOfDoors, fuelCapacity);
        this.isConvertible = isConvertible;
    }

    @Override
    public void turn() {
        System.out.println("Suzuki Katana is making a sharp turn.");
    }
}
