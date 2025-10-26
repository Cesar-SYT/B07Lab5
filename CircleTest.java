package lab4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class CircleTest {
	@Test
	public void testConstructorAndRadius() {
        Point centre = new Point(0, 0);
        Point edge = new Point(3, 4);
        Circle c = new Circle(centre, edge);
        assertEquals(5.0, c.radius);
    }
	
	@Test
	public void testPerimeter() {
        Point centre = new Point(0, 0);
        Point edge = new Point(3, 4);
        Circle c = new Circle(centre, edge);
        double expectedPerimeter = 2 * Math.PI * 5;
        assertEquals(expectedPerimeter, c.perimeter());
    }
	
	@Test
	public void testArea() {
        Point centre = new Point(0, 0);
        Point edge = new Point(0, 2);
        Circle c = new Circle(centre, edge);
        double expectedArea = Math.pow(2, 2) * Math.PI;
        assertEquals(expectedArea, c.area());
    }
	
	@Test
	public void testisSameCircleSameCenterDiffRadius() {
		Point centre1 = new Point(0, 0);
		Point edge1 = new Point(0, 2);
		
		Point centre2 = new Point(0, 0);
		Point edge2 = new Point(0, 1);
		
		Circle circle1 = new Circle(centre1, edge1);
		Circle circle2 = new Circle(centre2, edge2);
		
		assertFalse(circle1.isSameCircle(circle2));
    }
	
	@Test
	public void testisSameCircleSameRadiusDiffCenter() {
		Point centre1 = new Point(2, 1);
		Point edge1 = new Point(0, 1);
		
		Point centre2 = new Point(0, 0);
		Point edge2 = new Point(0, 2);
		
		Circle circle1 = new Circle(centre1, edge1);
		Circle circle2 = new Circle(centre2, edge2);
		
		assertFalse(circle1.isSameCircle(circle2));
    }
	
	@Test
	public void testisSameCircleAllSame() {
		Point centre1 = new Point(2, 1);
		Point edge1 = new Point(0, 1);
		
		Point centre2 = new Point(2, 1);
		Point edge2 = new Point(0, 1);
		
		Circle circle1 = new Circle(centre1, edge1);
		Circle circle2 = new Circle(centre2, edge2);
		
		assertTrue(circle1.isSameCircle(circle2));
    }
	
	@Test
	public void testisSameCircleAllDifferent() {
		Point centre1 = new Point(1, 0);
		Point edge1 = new Point(0, 1);
		
		Point centre2 = new Point(0, 0);
		Point edge2 = new Point(3, 4);
		
		Circle circle1 = new Circle(centre1, edge1);
		Circle circle2 = new Circle(centre2, edge2);
		
		assertFalse(circle1.isSameCircle(circle2));
    }
}
