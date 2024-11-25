package dev.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import model.Planet;

public class PlanetTest {

    @Test
    void testCalculateDensity() {
        Planet planet = new Planet(
            "TestPlanet", 2, 5.972e24, 1.08321e12, 12742, 150,
            Planet.PlanetType.TERRESTRIAL, true, 1.0, 1.0
        );
        double expectedDensity = 5.972e24 / 1.08321e12; 
        assertEquals(expectedDensity, planet.calculateDensity(), 1e-9);
    }

    @Test
    void testCalculateDensityZeroVolume() {
        Planet planet = new Planet(
            "TestPlanet", 2, 5.972e24, 0, 12742, 150,
            Planet.PlanetType.TERRESTRIAL, true, 1.0, 1.0
        );
        assertEquals(0, planet.calculateDensity());
    }

    @Test
    void testIsOuterPlanetTrue() {
        Planet planet = new Planet(
            "OuterPlanet", 0, 1.0e25, 1.0e15, 50000, 800,
            Planet.PlanetType.GASEOUS, false, 12.0, 0.5
        );
        assertTrue(planet.isOuterPlanet());
    }

    @Test
    void testIsOuterPlanetFalse() {
        Planet planet = new Planet(
            "InnerPlanet", 0, 1.0e24, 1.0e14, 30000, 150,
            Planet.PlanetType.TERRESTRIAL, true, 1.5, 1.0
        );
        assertFalse(planet.isOuterPlanet());
    }

    @Test
    void testGetters() {
        Planet planet = new Planet(
            "Earth", 1, 5.972e24, 1.08321e12, 12742, 150,
            Planet.PlanetType.TERRESTRIAL, true, 1.0, 1.0
        );

        assertEquals("Earth", planet.getName());
        assertEquals(1, planet.getNumberOfSatellites());
        assertEquals(5.972e24, planet.getMass());
        assertEquals(1.08321e12, planet.getVolume());
        assertEquals(12742, planet.getDiameter());
        assertEquals(150, planet.getAverageDistanceFromSun());
        assertEquals(Planet.PlanetType.TERRESTRIAL, planet.getType());
        assertTrue(planet.isVisibleToNakedEye());
        assertEquals(1.0, planet.getOrbitalPeriod());
        assertEquals(1.0, planet.getRotationalPeriod());
    }
}
