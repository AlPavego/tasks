package m02.s22;

import java.util.Locale;

public class T1 {
    public static void main(String[] args) {
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(1.0, 3.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(2);
        vC.print();
    }
}

class Vector2D {
    public double vX;
    public double vY;

    Vector2D(double vX, double vY){
        this.vX = vX;
        this.vY = vY;
    }

    Vector2D() {
        this.vX = 1.00d;
        this.vY = 1.00d;
    }

    Vector2D(Vector2D vector2D) {
        this.vX = vector2D.vX;
        this.vY = vector2D.vY;
    }

    void print() {
        String vX = String.format(Locale.US, "%.2f", this.vX);
        String vY = String.format(Locale.US, "%.2f", this.vY);
        System.out.printf("(%s, %s)\n", vX, vY);
    }

    void add(Vector2D vector2D) {
        vX += vector2D.vX;
        vY += vector2D.vY;
    }

    void sub(Vector2D vector2D) {
        vX -= vector2D.vX;
        vY -= vector2D.vY;
    }

    void scale(double scaleFactor) {
        vX *= scaleFactor;
        vY *= scaleFactor;
    }

    double length() {
        return (Math.sqrt((vX * vX) + (vY * vY)));
    }
}
