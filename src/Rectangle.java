/**
 * Rectangle is an immutable object.
 */
public class Rectangle {
    public final Point p1;
    public final Point p2;
    public final Point p3;
    public final Point p4;

    /***
     * Construct an immutable rectangle. We assume P1 is the 
     * left-top point, the remaining ones are ordered
     * in clockwise sequence.
     * @param p1 the first point (left-top)
     * @param p2 the second point (right-top)
     * @param p3 the third point (right-bottom)
     * @param p4 the fourth point (left-bottom)
     */
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
}
