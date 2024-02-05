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
        left.rotate(left.getCoords(),  -0.3);
        left.translate(left.getCoords(), new Point2d( 25.0, 0.0));
        letterA.addAll(left.getCoords());

        Rectangle right = new Rectangle(halfStripeThickness, maxHeight);
        right.rotate(right.getCoords(),  0.3);
        right.translate(right.getCoords(), new Point2d( -25.0,  0.0));
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
        BaseShape left = new Rectangle(stripeThickness, maxHeight);
        BaseShape top = new Circle(halfMaxHeight);
        BaseShape bottom = new Circle(halfMaxHeight);

        top.remove(new Circle(halfMaxHeight - stripeThickness));
        bottom.remove(new Circle(halfMaxHeight - stripeThickness));
        top.translate(top.getCoords(), new Point2d(0.0, halfMaxHeight / 2));
        bottom.translate(bottom.getCoords(), new Point2d(0.0, -halfMaxHeight / 2));
        left.translate(left.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        BaseShape letterB = new BaseShape();
        letterB.add(left).add(top).add(bottom);
        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = new BaseShape();
        Ellipse outside = new Ellipse(maxWidth, maxHeight);
        Ellipse inside = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        c.add(outside);
        c.remove(inside);

        BaseShape removeRect = new Rectangle(halfMaxWidth, halfMaxHeight);
        removeRect.translate(removeRect.getCoords(), new Point2d(halfMaxWidth, 0.0));

        c.remove(removeRect);

        return c;
    }


    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();
        Rectangle topE = new Rectangle(maxWidth-halfStripeThickness, halfStripeThickness);
        Rectangle middleE = new Rectangle(maxWidth-halfStripeThickness, halfStripeThickness);
        Rectangle bottomE = new Rectangle(maxWidth-halfStripeThickness, halfStripeThickness);
        Rectangle vertical = new Rectangle(halfStripeThickness, maxHeight);
        Point2d translationMiddle = new Point2d(0.0, halfMaxHeight-halfStripeThickness/2);
        Point2d translationVertical = new Point2d(-halfMaxWidth, 0.0);
        Point2d translationBottom = new Point2d(0.0, -halfMaxHeight+halfStripeThickness/2);
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
        Rectangle connector = new Rectangle(maxWidth, stripeThickness);

        leftSide.translate(leftSide.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        rightSide.translate(rightSide.getCoords(), new Point2d(halfMaxWidth, 0.0));


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


        BaseShape left = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape right = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape middle = new Rectangle(halfStripeThickness, maxHeight);

        left = new BaseShape(left.translate(left.getCoords(), new Point2d(-halfMaxWidth, 0.0)));
        right = new BaseShape(right.translate(right.getCoords(), new Point2d(halfMaxWidth, 0.0)));

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
        Ellipse outside = new Ellipse(maxWidth, maxHeight);
        Ellipse inside = new Ellipse(maxWidth-stripeThickness, maxHeight-stripeThickness);
        o.add(outside);
        o.remove(inside);
        return o;
    }

}