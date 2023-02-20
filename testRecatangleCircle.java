public class testRecatangleCircle {
    public static  void main (String[] arsg){
        Rectangle1 r1= new Rectangle1( new Point(10,150),new Point(70,-20));
        Rectangle1 r2= new Rectangle1( new Point(-20,70),new Point(55,50));
        Rectangle1 r3= new Rectangle1( new Point(20,20),new Point(100,-50));
        Circle1 c1 = new Circle1(new Point(20,20),10);
        Circle1 c2 = new Circle1(new Point(-10,-5),5);
        Circle1 c3 = new Circle1(new Point(10,15),5);

        Rectangle1 [] rarr= {r1,r2,r3};
        Circle1[] carr= {c1,c2,c3};

        System.out.println(r1+"/n");   // 1번문제
        System.out.println(r2+"/n");
        System.out.println(r3+"/n");
        System.out.println(c1+"/n");
        System.out.println(c2+"/n");
        System.out.println(c3+"/n");



        r1.translate(5,10);   //문제 2번
        c1.translate(5,10);
        System.out.println("r1 moved to  "+r1+"/n");
        System.out.println("c1 moved to  "+c1+"/n");


        System.out.printf("Rectangle comparing 190.00 with 460.00\ncomparing r1,r2--> %d \n",r1.compareTo(r2));
        System.out.printf("Circles comparing 62.83 with 31.42\ncomparing c1,c2--> %d \n",c1.compareTo(c2));



        double sumArea=0.0;            // 문제 4번
        double sumPerimeter=0.0;
        for(int i=0;i<3;i++){
            sumArea += rarr[i].area();
            sumArea += carr[i].area();

            sumPerimeter += rarr[i].perimeter();
            sumPerimeter += carr[i].perimeter();
        }
        System.out.printf("sum of area: %.2f\n",sumArea);
        System.out.printf("sum of perimeter: %.2f\n",sumPerimeter);


        for (Rectangle1 ra: rarr){ // 문제 5번
            System.out.println(ra+" contains (30.3,30.0) --> "+ra.contains(30.0,30.0)+"\n");
        }
        for (Circle1 ca: carr){ // 문제 5번
            System.out.println(ca+" contains (30.3,30.0) --> "+ca.contains(30.0,30.0)+"\n");
        }


    }
}
