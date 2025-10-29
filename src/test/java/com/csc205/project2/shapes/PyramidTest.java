package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    @Test
    void testSurfaceAreaAndVolume() {
        Pyramid squarePyramid = new Pyramid("Purple", 4.0, 6.0);

        double slantHeight = Math.sqrt(Math.pow(4.0 / 2.0, 2) + Math.pow(6.0, 2));
        double expectedSurface = Math.pow(4.0, 2) + 2 * 4.0 * slantHeight;
        double expectedVolume = (1.0 / 3.0) * Math.pow(4.0, 2) * 6.0;

        assertEquals(expectedSurface, squarePyramid.getSurfaceArea(), 0.001);
        assertEquals(expectedVolume, squarePyramid.getVolume(), 0.001);
    }

    @Test
    void testZeroDimensions() {
        Pyramid pyramid = new Pyramid("Flat", 0.0, 0.0);
        assertEquals(0.0, pyramid.getSurfaceArea(), 0.001);
        assertEquals(0.0, pyramid.getVolume(), 0.001);
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Pyramid("Purple", -4.0, 6.0));
        assertThrows(IllegalArgumentException.class, () -> new Pyramid("Purple", 4.0, -6.0));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new Pyramid("White", 3.0, 4.0);
        assertTrue(shape.getSurfaceArea() > 0);
        assertTrue(shape.getVolume() > 0);
    }
}

