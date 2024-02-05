package Interface;

import Point.Point2d;

import java.util.Collection;
import java.util.ArrayList;

public class Transform implements Rotate, Translate{
    /** TODO
     * Rotate all points of collections given in parameters
     * with the angle given
     * @param coords collections of Point2d
     * @param angle
     * @return rotated collection
     * */
    public Collection<Point2d> rotate(Collection<Point2d> coords, Double angle) {
        Collection<Point2d> rotatedCoords = new ArrayList<>();

        for (Point2d point : coords) {
            Point2d rotatedPoint = point.rotate(angle);
            rotatedCoords.add(rotatedPoint);
        }

        return rotatedCoords;

    }

    /** TODO
     * Translate all points of a collection by a given vector
     * @param coords Collection of Point2d
     * @param translateVector Vector of translation
     * @return translated coords
     * */
    public Collection<Point2d> translate(Collection<Point2d> coords, Point2d translateVector) {
        Collection<Point2d> translatedCoords = new ArrayList<>();

        for (Point2d point : coords) {
            Point2d translatedPoint = point.translate(translateVector);
            translatedCoords.add(translatedPoint);
        }

        return translatedCoords;
    }
}
