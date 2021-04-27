import java.util.ArrayList;

public class Polygon extends Shape {
    private final ArrayList<Double> sides;

    public Polygon(double... side) {
        sides = new ArrayList<>();
        for (Double arr : side)
            sides.add(arr);
    }

    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double answer = halfPerimeter;
        if (sides.size() == 3) {
            for (Double side : sides)
                answer *= halfPerimeter - side;
            return Math.sqrt(answer);
        } else {
            double sid = sides.get(0);
            for (Double side : sides) {
                if (!side.equals(sid))
                    return sid * side;
            }
        }
        return 0;
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (Double side : sides)
            perimeter += side;
        return perimeter;
    }

    public void draw() {
        if (sides.size() == 3)
            System.out.println("name: Triangle");
        else
            System.out.println("name: Rectangle");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());

    }

    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "sides=" + sides +
                '}';
    }
}
