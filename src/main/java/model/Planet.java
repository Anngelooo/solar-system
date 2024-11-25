package model;

public class Planet {

    private String name;
    private int numberOfSatellites;
    private double mass; 
    private double volume; 
    private int diameter;
    private int averageDistanceFromSun; 
    private PlanetType type;
    private boolean visibleToNakedEye;
    private double orbitalPeriod; 
    private double rotationalPeriod; 

    public enum PlanetType {
        GASEOUS, TERRESTRIAL, DWARF
    }

    
    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter,
                  int averageDistanceFromSun, PlanetType type, boolean visibleToNakedEye,
                  double orbitalPeriod, double rotationalPeriod) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceFromSun = averageDistanceFromSun;
        this.type = type;
        this.visibleToNakedEye = visibleToNakedEye;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationalPeriod = rotationalPeriod;
    }

    
    public String getName() { return name; }
    public int getNumberOfSatellites() { return numberOfSatellites; }
    public double getMass() { return mass; }
    public double getVolume() { return volume; }
    public int getDiameter() { return diameter; }
    public int getAverageDistanceFromSun() { return averageDistanceFromSun; }
    public PlanetType getType() { return type; }
    public boolean isVisibleToNakedEye() { return visibleToNakedEye; }
    public double getOrbitalPeriod() { return orbitalPeriod; }
    public double getRotationalPeriod() { return rotationalPeriod; }

    
    public double calculateDensity() {
        return (volume == 0) ? 0 : mass / volume;
    }

    public boolean isOuterPlanet() {
        double distanceInAU = (averageDistanceFromSun * 1_000_000.0) / 149_597_870;
        return distanceInAU > 3.4;
    }
}
