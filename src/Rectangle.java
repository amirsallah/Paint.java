import java.util.ArrayList;

public class Rectangle extends Polygon{
    private final ArrayList<Double> sides;

    public Rectangle(double ... side){
        super(side);
        sides = getSides();
    }

    public boolean isSquare(){
        double sid = sides.get(0);
        for (Double side:sides){
            if (!side.equals(sid))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }
}
