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
			width = dBC;
			length = dAC;
		} else if (diagonal == dBC) {
			width = dAB;
			length = dAC;
		} else {
			width = dAB;
			length = dBC;
		}
		
		if (Math.abs(width * width + length * length - diagonal * diagonal) > 0.001) {
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
		return Math.abs(width - length) < 0.001;
	}
}
