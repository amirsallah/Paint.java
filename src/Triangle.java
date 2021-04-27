import java.util.ArrayList;

public class Triangle extends Polygon{
    private final ArrayList<Double> sides;

    public Triangle(double ... side){
        super(side);
        sides = getSides();
    }

    public boolean isEquilateral(){
        double sid = sides.get(0);
        for (Double side:sides){
            if (!side.equals(sid))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }
}
