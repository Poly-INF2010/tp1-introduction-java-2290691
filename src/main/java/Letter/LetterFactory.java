package Letter;

import Point.Point2d;
import Shape.*;
import java.util.Collection;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;



    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape letterA = new BaseShape();

        Rectangle left = new Rectangle(halfStripeThickness, maxHeight);
        left.rotate(left.getCoords(),  (11.5 + Math.PI) / 6);
        left.translate(left.getCoords(), new Point2d( 30.0, 0.0));
        letterA.addAll(left.getCoords());

        Rectangle right = new Rectangle(halfStripeThickness, maxHeight);
        right.rotate(right.getCoords(),  Math.PI / 9);
        right.translate(right.getCoords(), new Point2d( -30.0,  0.0));
        letterA.addAll(right.getCoords());

        Rectangle middle = new Rectangle( halfMaxWidth + 10, halfStripeThickness);
        middle.translate(middle.getCoords(), new Point2d( 0.0,  -2.0));
        letterA.addAll(middle.getCoords());

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */

    public static BaseShape create_B() {
        // return null;
        double width = halfMaxWidth - stripeThickness;
        double height = maxHeight - stripeThickness;

        // create one rectangle and 2 ellipses
        BaseShape left = new Rectangle(width, height);
        BaseShape top = new Circle(halfMaxHeight);
        BaseShape bottom = new Circle(halfMaxHeight);

        top.remove(new Circle(halfMaxHeight - stripeThickness));
        bottom.remove(new Circle(halfMaxHeight - stripeThickness));

        // translate the shapes to the correct position
        top = new BaseShape(top.translate(top.getCoords(), new Point2d(0.0, halfMaxHeight / 2)));
        bottom = new BaseShape(
                bottom.translate(bottom.getCoords(), new Point2d(0.0, -halfMaxHeight / 2)));
        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-halfMaxHeight / 2, 0.0)));

        // create the letter B
        BaseShape letterB = new BaseShape();
        letterB.add(left).add(top).add(bottom);

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        double a = maxHeight;
        double b = maxWidth;

        BaseShape letterC = new Ellipse(b, a);

        BaseShape removeEllipse = new Ellipse(b / 1.5, a / 1.5);
        BaseShape removeRect = new Rectangle(halfMaxWidth, halfMaxHeight);
        removeRect = new BaseShape(removeRect.translate(removeRect.getCoords(), new Point2d(halfMaxWidth, 0.0)));
        letterC.remove(removeEllipse);
        letterC.remove(removeRect);

        return letterC;
    }


    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();
        Rectangle topE = new Rectangle(50.0, 10.0);
        Rectangle middleE = new Rectangle(50.0, 10.0);
        Rectangle bottomE = new Rectangle(50.0, 10.0);
        Rectangle vertical = new Rectangle(10.0, 100.0);
        Point2d translationMiddle = new Point2d(0.0, 50.0);
        Point2d translationVertical = new Point2d(-20.0, 50.0);
        Point2d translationBottom = new Point2d(0.0, 100.0);
        vertical.translate(vertical.getCoords(), translationVertical);
        middleE.translate(middleE.getCoords(), translationMiddle);
        bottomE.translate(bottomE.getCoords(), translationBottom);
        e.add(topE);
        e.add(middleE);
        e.add(bottomE);
        e.add(vertical);
        return e;
    }
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();

        Rectangle leftSide = new Rectangle(stripeThickness, maxHeight);
        Rectangle rightSide = new Rectangle(stripeThickness, maxHeight);
        Rectangle connector = new Rectangle(maxWidth - 2 * stripeThickness, stripeThickness);

        leftSide.translate(leftSide.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness, 0.0));

        rightSide.translate(rightSide.getCoords(), new Point2d(halfMaxWidth - halfStripeThickness, 0.0));

        connector.translate(connector.getCoords(), new Point2d(0.0, 0.0)); // Pas de déplacement, mais ajustez si nécessaire

        h.add(leftSide);
        h.add(rightSide);
        h.add(connector);

        return h;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        // return null;
        double width = halfMaxWidth - stripeThickness;
        double height = maxHeight - stripeThickness;

        BaseShape left = new Rectangle(width, height);
        BaseShape right = new Rectangle(width, height);
        BaseShape middle = new Rectangle(width, maxHeight);

        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-halfMaxHeight / 3, 0.0)));
        right = new BaseShape(right.translate(right.getCoords(), new Point2d(halfMaxHeight / 3, 0.0)));

        middle = new BaseShape(middle.rotate(middle.getCoords(), Math.toRadians(-20)));

        BaseShape letterN = new BaseShape();

        letterN.add(left).add(right).add(middle);

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape o = new BaseShape();
        Ellipse outside = new Ellipse(60.0, 120.0);
        Ellipse inside = new Ellipse(40.0, 100.0);
        o.add(outside);
        o.remove(inside);
        return o;
    }

}