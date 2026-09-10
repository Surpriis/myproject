package project.rockets;

import project.cosmicobjects.CosmicObject;

public abstract class Rocket {
    private final int TANK_CAPACITY;
    private float fuelInMoment;
    private final int SPEED;
    private final float AVERAGE_CONSUMPTION;
    private CosmicObject currentLocation;

    public Rocket(int TANK_CAPACITY, int SPEED, float AVERAGE_CONSUMPTION, float fuelInMoment, CosmicObject currentLocation) {
        this.TANK_CAPACITY = TANK_CAPACITY;
        this.fuelInMoment = fuelInMoment;
        this.AVERAGE_CONSUMPTION = AVERAGE_CONSUMPTION;
        this.SPEED = SPEED;
        this.currentLocation = currentLocation;
    }

    public void fly(CosmicObject planet) {
        System.out.println("Fly from " + currentLocation.getName() + " To " + planet.getName());
        int distance = planet.getDistanceToEarth() - currentLocation.getDistanceToEarth();
        float requiredFuel = (distance / 100) * AVERAGE_CONSUMPTION;
        if (fuelInMoment >= requiredFuel) {
            int travelTime = distance / SPEED;
            fuelInMoment -= requiredFuel;
            currentLocation = planet;
            System.out.println("Time spended to fly : " + travelTime + " h.");
        } else {
            System.out.println("Not enough fuel to fly");
        }
    }

    public void refuel(float amount) {
        if (currentLocation.isRefuelAvailable()){
            if (fuelInMoment + amount >= TANK_CAPACITY) {
                float refueledAmount = TANK_CAPACITY - fuelInMoment;
                fuelInMoment = TANK_CAPACITY;

                System.out.println("The tank was filled to full!");
                System.out.println("Filled: " + refueledAmount + " of fuel");

            } else if (fuelInMoment + amount <= 0) {
                fuelInMoment = 0;
                System.out.println("Tank is empty");
            } else {
                fuelInMoment = (fuelInMoment + amount);
                System.out.println("Filled: " + amount + " of fuel");
            }
        } else {
            System.out.println("Gas Stantion absent on planet");
        }

    }

    public void printInfo() {
        System.out.println("Rocket Info\n Fuel - " +
                fuelInMoment + "\nDistance from Earth - " +
                currentLocation.getDistanceToEarth());
    }
}
