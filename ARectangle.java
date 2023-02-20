public class ARectangle extends AbstractShape {
    private double width;
    private double height;
    public ARectangle(double w, double h){
        width=w;
        height=h;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public double getArea(){
        return width*height;

    }
    @Override
    public double getPerimeter(){
        return 2*(width+height);
    }
    public static void main(String[] args){
        AbstractShape[] shapes = new AbstractShape[2];
        ARectangle ar= new ARectangle(20,20);
        //System.out.println(ar.getArea());
        //System.out.println(ar.getPerimeter());
        Acircle ac=new Acircle(10);
        //System.out.println(ac.getArea());
        //System.out.println(ac.getPerimeter());

        shapes[0]= ar;
        shapes[1]=ac;
        for(AbstractShape shape :shapes){
            System.out.println(shape.getArea());

        }

    }

}
