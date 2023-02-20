public class Point {
    protected int x;
    protected int y;
    public Point(){};
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    @Override
    public String toString(){return"점의 좌표는 x:"+x+"y:"+y;}
}

