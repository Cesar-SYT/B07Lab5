package lab5;

import lab4.Point;

public class Diamond {
	/**
	 * Represents a Diamond shape.
	 * Note: User should provide 4 points in either clock-wise or counter-clock-wise
	 * order.
	 * 
	 * @version 1.0
	 * @since 2025-10-24
	 */
	private Point A;
	private Point B;
	private Point C;
	private Point D;

	public Diamond(Point A, Point B, Point C, Point D) throws Exception {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		if (!(Math.abs(dAB - dBC) < 1e-6 && Math.abs(dBC - dCD) < 1e-6 && Math.abs(dCD - dDA) < 1e-6)) {
			throw new Exception("Input is not a valid diamond");
		}
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

	public double perimeter() {
		return A.distance(B) * 4;
	}

	public boolean isSquare() {
		double dAC = A.distance(C);
		double dBD = B.distance(D);
		return Math.abs(dAC - dBD) < 1e-6;
	}
}
