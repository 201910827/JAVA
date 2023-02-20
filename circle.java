public class circle extends Point{
    private double radius;
    public circle(){};
    public circle(int x, int y, double r){
        super(x,y);
        radius=r;
    }
    public double getR(){return radius;}
    public double Circumference(){return 2*Math.PI*radius;}
    public double getArea(){return Math.PI*radius*radius;}

}



/*public class circle2{ // circle은 항상 점이 있으니 위에 상속이 더 적합히다
    Point p;
    private double radius;
    public circle2(){}
    public circle2(int x,int y, double r){
        p=new Point(x,y);
        radius=r;

    }*/


//}
