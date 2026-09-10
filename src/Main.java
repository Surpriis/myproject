import project.rockets.*;
import project.cosmicobjects.*;

void main() {
    Earth earth = new Earth(true);
    PassengerRocket rocket1 = new PassengerRocket(earth);
    CargoRocket rocket2 = new CargoRocket(earth);
    Moon moon = new Moon(true);
    Venus venus = new Venus(true);
    Mercury mercury = new Mercury(true);
    Sun sun = new Sun(false);


    System.out.println("Passanger\n");
    rocket1.fly(moon);
    rocket1.printInfo();
    rocket1.fly(mercury);
    rocket1.printInfo();
    System.out.println("Cargo\n");
    rocket2.fly(venus);
    rocket2.printInfo();
    rocket2.fly(sun);
    rocket2.refuel(10000);
    rocket2.printInfo();
}