import java.util.Scanner;
public class arrHashNoFor {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char[] s;
        s= new char[5];
        double res= 0.0;
        System.out.println("문자 다섯 개를 한 줄에 한 개 씩 입력하세요");
        s[0]= sc.next().charAt(0);
        s[1]= sc.next().charAt(0);
        s[2]= sc.next().charAt(0);
        s[3]= sc.next().charAt(0);
        s[4]= sc.next().charAt(0);
        res+= s[0]*Math.pow(31,(5-1));
        res+= s[1]*Math.pow(31,(5-2));
        res+= s[2]*Math.pow(31,(5-3));
        res+= s[3]*Math.pow(31,(5-4));
        res+= s[4]*Math.pow(31,(5-5));
        System.out.print("문자열 ");
        System.out.printf("%c",s[0]);
        System.out.printf("%c",s[1]);
        System.out.printf("%c",s[2]);
        System.out.printf("%c",s[3]);
        System.out.printf("%c",s[4]);
        System.out.printf("의 해시 값은 %.2f입니다.",res);

    }

}

