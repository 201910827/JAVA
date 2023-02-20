public class RectangleImpl extends Rectangle implements Ishape{
    //private  double width,height;
    public RectangleImpl(double w, double h){
        super(w,h);
       // width=w;
        //height=h;
    }

    @Override   //그럼 인터페이스가 왜 좋은거지? 짜피 선언을 하는데
    public double getArea(){
        return width*height;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+height);

    }
    public static void main(String[] args){
        Ishape i=new RectangleImpl(20,20);
        System.out.println(i.getArea());
        System.out.println(i.getPerimeter());

    }
}
