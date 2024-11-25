package dev.exercise;

import controller.PlanetController;
import model.Planet;
import view.PlanetView;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Planet earth = new Planet(
            "Earth", 1, 5.972e24, 1.08321e12, 12742, 150,
            Planet.PlanetType.TERRESTRIAL, true, 1.0, 1.0
        );

        Planet jupiter = new Planet(
            "Jupiter", 79, 1.898e27, 1.43128e15, 139820, 778,
            Planet.PlanetType.GASEOUS, true, 11.86, 0.41
        );

        
        PlanetView view = new PlanetView();

        
        PlanetController earthController = new PlanetController(earth, view);
        PlanetController jupiterController = new PlanetController(jupiter, view);

        
        System.out.println("Planet 1:");
        earthController.displayPlanetDetails();

        System.out.println("\nPlanet 2:");
        jupiterController.displayPlanetDetails();
    }
}
