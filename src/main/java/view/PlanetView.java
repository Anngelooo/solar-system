package view;

import model.Planet;

public class PlanetView {

    public void displayAttributes(Planet planet) {
        System.out.println("Name: " + planet.getName());
        System.out.println("Number of satellites: " + planet.getNumberOfSatellites());
        System.out.println("Mass: " + planet.getMass() + " kg");
        System.out.println("Volume: " + planet.getVolume() + " km³");
        System.out.println("Diameter: " + planet.getDiameter() + " km");
        System.out.println("Average distance from Sun: " + planet.getAverageDistanceFromSun() + " million km");
        System.out.println("Planet type: " + planet.getType());
        System.out.println("Visible to naked eye: " + planet.isVisibleToNakedEye());
        System.out.println("Orbital period: " + planet.getOrbitalPeriod() + " years");
        System.out.println("Rotational period: " + planet.getRotationalPeriod() + " days");
    }

    public void displayDensity(Planet planet) {
        System.out.println("Density: " + planet.calculateDensity() + " kg/km³");
    }

    public void displayIfOuterPlanet(Planet planet) {
        System.out.println("Is it an outer planet? " + planet.isOuterPlanet());
    }
}
