package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import lab4.Point;
import lab5.Diamond;

public class DiamondTest {
    private Point squareA = new Point(0, 0);
    private Point squareB = new Point(1, 0);
    private Point squareC = new Point(1, 1);
    private Point squareD = new Point(0, 1);
    
    private Point rhombusA = new Point(2, 0);
    private Point rhombusB = new Point(0, 1);
    private Point rhombusC = new Point(-2, 0);
    private Point rhombusD = new Point(0, -1);
    
    private Point invalidA = new Point(0, 0);
    private Point invalidB = new Point(2, 0);  
    private Point invalidC = new Point(2, 1);
    private Point invalidD = new Point(0, 1);
    
    // Diamond constructor tests
    @Test
    void testDiamondConstructorValidSquare() throws Exception {
        Diamond diamond = new Diamond(squareA, squareB, squareC, squareD);
        assertNotNull(diamond);
    }
    @Test
    void testDiamondConstructorWithInvalidShape() {
        assertThrows(Exception.class, () -> {
            new Diamond(invalidA, invalidB, invalidC, invalidD);
        });
    }

    // Perimeter tests
    @Test
    void testPerimeterSquare() throws Exception {
        Diamond diamond = new Diamond(squareA, squareB, squareC, squareD);
        double expectedPerimeter = 4.0; 
        assertEquals(expectedPerimeter, diamond.perimeter(), 0.001);
    }
    
    // isSquare tests
    @Test
    void testIsSquareTrue() throws Exception {
        Diamond diamond = new Diamond(squareA, squareB, squareC, squareD);
        assertTrue(diamond.isSquare());
    }
    
    @Test
    void testIsSquareFalse() throws Exception {
        Diamond diamond = new Diamond(rhombusA, rhombusB, rhombusC, rhombusD);
        assertFalse(diamond.isSquare());
    }
  
    // Edge case tests
    @Test
    void testDiamondWithNegativeCoordinates() throws Exception {
        Point a = new Point(-2, -2);
        Point b = new Point(-1, -2);
        Point c = new Point(-1, -1);
        Point d = new Point(-2, -1);
        
        Diamond diamond = new Diamond(a, b, c, d);
        assertTrue(diamond.isSquare());
        assertEquals(4.0, diamond.perimeter(), 0.001);
    }
    
    @Test
    void testDiamondWithMixedCoordinates() throws Exception {
        Point a = new Point(-1, -1);
        Point b = new Point(1, -1);
        Point c = new Point(1, 1);
        Point d = new Point(-1, 1);
        
        Diamond diamond = new Diamond(a, b, c, d);
        assertTrue(diamond.isSquare());
        assertEquals(8.0, diamond.perimeter(), 0.001);
    }
    
