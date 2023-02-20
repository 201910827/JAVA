public interface Shape {
    boolean contains(double x, double y);
    boolean intersects(Object o);
    double area();
    double perimeter();
    void translate(int x,int y);
}
