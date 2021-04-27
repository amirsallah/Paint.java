public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        Shape shape1 = new Triangle(3,4,5);
        Shape shape2 = new Triangle(3,6,5);
        Shape shape3 = new Triangle(5,5,5);
        Shape shape4 = new Rectangle(9,4,9,4);
        Shape shape5 = new Rectangle(3,3,3,3);
        Shape shape6 = new Circle(3);
        Shape shape7 = new Circle(6);
        Shape shape8 = new Circle(4);
        paint.addShape(shape1);
        paint.addShape(shape2);
        paint.addShape(shape3);
        paint.addShape(shape4);
        paint.addShape(shape5);
        paint.addShape(shape6);
        paint.addShape(shape7);
        paint.addShape(shape8);

        paint.drawAll();
        System.out.println("__________________________________");
        System.out.println("__________________________________");
        paint.printAll();
        System.out.println("__________________________________");
        System.out.println("__________________________________");
        paint.describeEqualSides();
        System.out.println("__________________________________");
        System.out.println("__________________________________");

    }
}
