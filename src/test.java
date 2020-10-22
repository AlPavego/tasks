class Point{
    int x;
    int y;
}

class Square{
    Point p;
    float l;

    void print(){
        System.out.printf("square: point: {%d; %d} len: %f", p.x, p.y, l);
    }
}

public class test {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 2;
        point.y = 2;

        Square square = new Square();
        square.p = point;
        square.l = 2.0f;
        square.print();
    }
}
