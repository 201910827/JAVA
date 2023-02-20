import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;                      //a는 2차항 b 1차항 c는 상수항
        double x1,x2;                   //근 2개
        System.out.println("2차항의 계수를 입력하시오");
        a=sc.nextInt();
        System.out.println("1차항의 계수를 입력하시오");
        b=sc.nextInt();
        System.out.println("상수항의 계수를 입력하시오");
        c=sc.nextInt();
        double  num;                 //b*b-4ac의 값
        double rt;                   //루트 계산한 값
        num=(b*b)-(4*a*c);
        rt=Math.sqrt(num);
        x1=(-b+rt)/(2*a);
        x2=(-b-rt)/(2*a);
        System.out.printf("입력하신 이차방정식의 해는 %d %d 입니다. ",(int)x1,(int)x2);

    }

}
