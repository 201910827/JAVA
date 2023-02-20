public class Acircle extends AbstractShape{
    private double PI=3.14;
    private double r;
    Acircle(double r){
        this.r=r;

    }
    @Override
    public double getArea(){
        return PI*r*r;
    }
    @Override
    public double getPerimeter(){
        return 2*PI*r;
    }

}
