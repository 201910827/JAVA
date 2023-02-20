
import java.awt.*;
import java.util.Objects;
public class Circle1 implements Shape {
    Point center;
    double radius;
    Circle1(Point p,double radius){
        this.center=p;
        this.radius=radius;
    }
    @Override
    public boolean contains (double x, double y){
        double dist=(Math.abs(center.x-x))+(Math.abs(center.y-y));
        if(dist<radius) return true;
        else return false;

    }
    public boolean intersects(Object o){
        Circle1 c1 =(Circle1) o;
        double sumR= radius+c1.getRadius();
        double distPts= Math.sqrt((center.x-c1.center.getX()) * (center.x-c1.center.getX())+
                (center.y-c1.center.getY()) * (center.y-c1.center.getY()));
        if(distPts>sumR){
            return false;
        }else {
            return true;
        }

    }
    public double area(){
        return Math.PI*radius*radius;
    }
   public double perimeter(){
        return Math.PI*2*radius;
    }
    public void translate(int x,int y){
        center.x+=x;
        center.y+=y;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "("+center.x+","+center.y+")~"+radius+"p: "+perimeter();
        // center+"~"+radius+"p"+perimeter()+"\n";
    }

    public int compareTo(Circle1 c){
        if(perimeter() == c.perimeter()) return 0;
        else if(perimeter() < c.perimeter()) return -1;
        else return 1;
    }

    /* @Override
    public int compareTo(int t) {
        return 0;
    }*/
}
