package project.cosmicobjects;

public abstract class CosmicObject {
    private final boolean refuelAvailable;
    private final int distance;
    private final String name;

    public CosmicObject(boolean refuelAvailable, int distance, String name) {
        this.refuelAvailable = refuelAvailable;
        this.distance = distance;
        this.name = name;
    }

    public boolean isRefuelAvailable(){
        return refuelAvailable;
    }

    public int getDistanceToEarth() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
