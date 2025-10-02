package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    void testSurfaceAreaAndVolume() {
        Cube cube = new Cube("Blue", 2.0);
        assertEquals(24.0, cube.getSurfaceArea(), 0.001); // 6a²
        assertEquals(8.0, cube.getVolume(), 0.001);       // a³
    }

    @Test
    void testZeroSideLength() {
        Cube cube = new Cube("Tiny", 0.0);
        assertEquals(0.0, cube.getSurfaceArea(), 0.001);
        assertEquals(0.0, cube.getVolume(), 0.001);
    }

    @Test
    void testInvalidSideLength() {
        assertThrows(IllegalArgumentException.class, () -> new Cube("Blue", -1.0));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new Cube("Red", 3.0);
        assertEquals(54.0, shape.getSurfaceArea(), 0.001);
        assertEquals(27.0, shape.getVolume(), 0.001);
    }
}
