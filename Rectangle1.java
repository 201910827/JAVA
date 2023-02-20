public class Rectangle1 implements Shape{
    Point p1,p2;
    Point ceter;
    double width,height;
    Rectangle1(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
        width=(p2.x-p1.x);
        height=(p1.y-p2.y);
       /* if(p1.getX()<p2.getX()){  // p1이 upper left이다
            ceter = new Point((p2.getX()-p1.getX())/2,(p1.getY()-p2.getY())/2);
            width=(p2.getX()-p1.getX());
            height=(p1.getY()-p2.getY());
        }else{
            ceter = new Point((p1.getX()-p2.getX())/2,(p2.getY()-p1.getY())/2);  // p2가 lowwerright이다
            width=(p1.getX()-p2.getX());
            height=(p2.getY()-p1.getY());
        }*/



    }


    public boolean contains(double x, double y){
        if((p1.x <= x) && (p2.x>=x) && (p1.y>=y) &&( p2.y <=y)){
            return true;
        }else return false;

    }
    public boolean intersects(Object o){
        Rectangle1 r = (Rectangle1) o;
        p1.x += width;
        p1.y -= height;
        if(Math.abs(width/2-r.width/2)<=Math.abs(p1.x-r.p1.x) && Math.abs(p1.x-r.p1.x)<width/2+r.width/2 &&
                (Math.abs(height/2-r.height/2))<=Math.abs(p1.y-r.p1.y)&& Math.abs(p1.y-r.p1.y)<height/2+r.height/2) {
            return true;
        }
        else return false;
    }

    public double area(){
        return (p2.x-p1.x) * (p1.y-p2.y);
    }
    public double perimeter(){
        return 2*((p2.x-p1.x) +(p1.y-p2.y));
    }
    public void translate(int x,int y){
        p1.x+=x;
        p2.x+=x;
        p1.y+=y;
        p2.y+=y;
    }

    @Override
    public String toString() {
        return "("+p1.x+","+p1.y+")("+p2.x+","+p2.y+") p: "+perimeter();
                //p1.toString()+p2.toString()+"p: "+perimeter()+"\n";
    }


    public int compareTo(Rectangle1 r){
        if(perimeter() == r.perimeter())
            return 0;
        else if(perimeter() < r.perimeter())
            return -1;
        else return 1;
    }
}
