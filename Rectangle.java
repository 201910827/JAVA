public class Rectangle implements Cloneable {
    protected  double height;
    protected  double width;
    public Rectangle(double w,double h){
        height=h;
        width=w;
    }
    public double getWidth(){return width;}
    public double getHeight(){return height;}
}
