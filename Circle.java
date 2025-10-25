public class Circle {
    Point centre;
    double radius;
    public Circle(Point centre, Point edge){
        this.centre = centre;
        radius = centre.distance(edge);
    }

    public double perimeter(){
        return 2 * radius * Math.PI;
    }

    public double area(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public boolean isSameCircle(Circle other){
        return centre.equals(other.centre) && radius == other.radius;
    }
}
