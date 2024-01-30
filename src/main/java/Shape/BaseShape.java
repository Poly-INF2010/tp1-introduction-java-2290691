package Shape;

import Interface.Transform;
import Point.Point2d;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class BaseShape extends Transform implements Cloneable {
    private final Collection<Point2d> coords;

//helper function to clone a list of points 
  public Collection<Point2d> cloneCoords(Collection<Point2d> coords) {
        return coords.stream().map(Point2d::clone).collect(Collectors.toList());
    }

    /** TODO
     * Create a BaseShape with empty coordinades
     */
    public BaseShape() {
        this.coords = new ArrayList<>();
    }

    /** TODO
     * Create a BaseShape from a collection of 2D points
     * @param coords The collection of 2D points
     */
    public BaseShape(Collection<Point2d> coords) {
        this.coords = new ArrayList<>(cloneCoords(coords));
    }

    /** TODO
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
    public BaseShape add(Point2d coord) {
        this.coords.add(coord.clone());
        return this;
    }

    /** TODO
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
        this.coords.addAll(cloneCoords(shape.coords));
        return this;
    }

    /** TODO
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        BaseShape newShape = this;
        for(Point2d point : coords){
            newShape.add(new Point2d(point.X(), point.Y()));
        }
        return newShape;
    }

    /** TODO
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
        List<Point2d> copyCoords = new ArrayList<>(this.coords);
        for (Point2d point : copyCoords){
            if (point.X() == coord.X() && point.Y() == coord.Y()){
                this.coords.remove(point);
            }
        }
        return this;
    }

    /** TODO
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {
        for(Point2d point2d : shape.coords){
            this.remove(point2d);
        }
        return this;
    }

    /** TODO
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
        for(Point2d point2ds : coords){
            this.remove(point2ds);
        }
        return this;
    }

    /** TODO
     *  Replace all the coords in a shape with new ones
     * @param newCoords new coords to replace the old one
     * @return Updated BaseShape
     * */
    public BaseShape replaceAll(Collection<Point2d> newCoords) {
        this.coords.clear();
        this.coords.addAll(newCoords);
        return this;
    }

    /** TODO
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {

        return new ArrayList<>(this.coords);
    }

    /** TODO
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        List<Point2d> cloneCoords = new ArrayList<>();

        for (Point2d point : this.coords) {
            cloneCoords.add(point.clone());
        }
        return cloneCoords;
    }

    /** TODO
     * @return Maximum X coordinate of the shape
     */
    public Double getMaxX() {
        double maxX = -Double.MAX_VALUE;
        for (Point2d point : this.coords) {
            if (maxX <= point.X()){
                maxX = point.X();
            }
        }
        return  maxX;
    }

    /** TODO
     * @return Maximum Y coordinate of the shape
     */
    public Double getMaxY() {
        double maxY = -Double.MAX_VALUE;
        for (Point2d point : this.coords) {
            if (maxY <= point.Y()){
                maxY = point.Y();
            }
        }
        return  maxY;
    }

    /** TODO
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        Point2d point2d = new Point2d(this.getMaxX(), this.getMaxY());
        return point2d;
    }

    /** TODO
     * @return Minimum X coordinate of the shape
     */
    public Double getMinX() {
        double minX = +Double.MAX_VALUE;
        for (Point2d point : this.coords) {
            if (minX >= point.X()){
                minX = point.X();
            }
        }
        return  minX;
    }

    /** TODO
     * @return Minimum Y coordinate of the shape
     */
    public Double getMinY() {
        double minY = +Double.MAX_VALUE;
        for (Point2d point : this.coords) {
            if (minY >= point.Y()){
                minY = point.Y();
            }
        }
        return  minY;
    }

    /** TODO
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        Point2d point2d = new Point2d(this.getMinX(), this.getMinY());
        return point2d;
    }

    /** TODO
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {
        return new BaseShape(this.coords);
    }
}
