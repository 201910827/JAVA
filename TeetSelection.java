public class TeetSelection {
    public static void main(String[] args){
        Selection s1=new Selection();
        SelectableRectangle sr=new SelectableRectangle(new Point(0,0),10,10);
        Point p=new Point(10,3);
        s1.select(sr,p);
        System.out.println(sr.getSelected());


    }
}
