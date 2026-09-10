package project.rockets;

import project.cosmicobjects.CosmicObject;

public class PassengerRocket extends Rocket {


    public PassengerRocket(CosmicObject currentLocation) {
        super(2000, 20000, 10, 2000, currentLocation);
    }
}
