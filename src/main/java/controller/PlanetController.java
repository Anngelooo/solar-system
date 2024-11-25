package controller;

import model.Planet;
import view.PlanetView;

public class PlanetController {

    private Planet planet;
    private PlanetView view;

    public PlanetController(Planet planet, PlanetView view) {
        this.planet = planet;
        this.view = view;
    }

    public void displayPlanetDetails() {
        view.displayAttributes(planet);
        view.displayDensity(planet);
        view.displayIfOuterPlanet(planet);
    }
}
