package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        double a = widthDiameter / 2.0;
        double b = heightDiameter / 2.0;

        for (double i = -a; i <= a; i += 0.5) {
            for (double j = -b; j <= b; j += 0.5) {

                double x = i;
                double y = j;


                double ellipseEquation = (x * x) / (a * a) + (y * y) / (b * b);

                if (ellipseEquation <= 1.0) {

                    this.add(new Point2d(i, j));
                }
            }
        }

    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return this.clone();
    }
}