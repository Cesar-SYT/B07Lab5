package lab5;
import java.lang.Math;

import lab4.Point;

public class Rectangle {
	Point A;
	Point B;
	Point C;
    double width;
	double length;
	double diagonal;
	
	public Rectangle(Point A, Point B, Point C) {
		this.A = A;
		this.B = B;
		this.C = C;
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dAC = A.distance(C);
        diagonal = Math.max(dAB, Math.max(dBC, dAC));
        if (diagonal == dAB) {
            width = Math.min(dBC, dAC);
            length = Math.max(dBC, dAC);
        } else if (diagonal == dBC) {
            width = Math.min(dAB, dAC);
            length = Math.max(dAB, dAC);
        } else {
            width = Math.min(dAB, dBC);
            length = Math.max(dAB, dBC);
        }
		if (width * width + length * length != diagonal * diagonal) {
			throw new IllegalArgumentException("Can't form a Rectangle!");
		}
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}

	public double area() {
		return width * length;
	}
	
	public boolean isSquare() {
		return (width == length);
	}
}
