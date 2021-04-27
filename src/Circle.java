public class Circle extends Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2*3.14*radius;
    }

    public double  calculateArea(){
        return 3.14*radius*radius;
    }

    public void draw(){
        System.out.println("name: circle");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
