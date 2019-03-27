package com.random.kafka.com.learn;

public class SixxPoint {
    private double x, y;

    /**
     * Create a point with predefined coordinates.
     * @param x X-coordinate
     * @param y Y-coordinate
     */
    public SixxPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Create a point with default coordinates 0, 0.
     */
    public SixxPoint() { this(0, 0); }

    /**
     * Get an X-coordinate.
     * @return X-coordinate
     */
    public double getX() { return x; }

    /**
     * Get a Y-coordinate.
     * @return Y-coordinate
     */
    public double getY() { return y; }

    /**
     * Move a point to new coordinates, change the original point.
     * @param a X-coordinate shift
     * @param b Y-coordinate shift
     */
    public void translate(double a, double b) {
        x += a;
        y += b;
    }

    /** Scale coordinates according to a coefficient, change the original point.
     * @param c Coefficient of scaling
     */
    public void scale(double c) {
        x *= c;
        y *= c;
    }


    public static void main(String[] args) {
        SixxPoint p = new SixxPoint(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
        System.out.println(p.getX() + " " + p.getY());
    }




}
