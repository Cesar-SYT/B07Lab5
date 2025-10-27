package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import lab4.Point;

public class RectangleTests {

    @Test
    public void testBasic() {
        Point p1 = new Point(0.5, 2.3);
        Point p2 = new Point(0.5, 5.8); 
        Point p3 = new Point(4.2, 2.3);
        Rectangle r = new Rectangle(p1, p2, p3);

        assertEquals(14.4, r.perimeter(), 0.01);
        assertEquals(12.95, r.area(), 0.01);
        assertFalse(r.isSquare());
    }

    @Test
    public void testSq() {
        Point a = new Point(-1, 3);
        Point b = new Point(-1, 6.1);
        Point c = new Point(2.1, 3);
        Rectangle sq = new Rectangle(a, b, c);

        assertTrue(sq.isSquare());
        assertEquals(12.4, sq.perimeter(), 0.01);
    }

    @Test
    public void testBad() {
        Point x = new Point(1, 2);
        Point y = new Point(3, 5);
        Point z = new Point(7, 8);
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(x, y, z);
        });
    }

    @Test
    public void testMixed() {
        Point p = new Point(-3.2, -1.7);
        Point q = new Point(-3.2, 2.5);
        Point r = new Point(2.1, -1.7);
        Rectangle rect = new Rectangle(p, q, r);

        assertEquals(19.0, rect.perimeter(), 0.01);
        assertEquals(22.26, rect.area(), 0.01);
    }
}