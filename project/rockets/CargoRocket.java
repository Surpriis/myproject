package project.rockets;

import project.cosmicobjects.CosmicObject;

public class CargoRocket extends Rocket {

    public CargoRocket(CosmicObject currentLocation) {
        super(2000000, 15000, 15, 2000000, currentLocation);
    }
}