package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        Point2d topLeft = new Point2d(-width/2, height/2);
        Point2d topRight = new Point2d(width/2, height/2);
        Point2d bottomLeft = new Point2d(-width/2, -height/2);

        for( double x = topLeft.X() ; x <= topRight.X(); x += 0.5)
        {
            for( double y = bottomLeft.Y(); y<= topLeft.Y(); y += 0.5){

                Point2d temp = new Point2d(x,y);
                this.add(temp);
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
       this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
            this.addAll(cloneCoords(coords));
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return this.clone();
    }
}
