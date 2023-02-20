import java.util.Scanner;
public class arrHash {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char[] s;
        s= new char[5];
        double res= 0.0;
        System.out.println("문자 다섯 개를 한 줄에 한 개 씩 입력하세요");
        for (int arrNumber=0;arrNumber<5;arrNumber++)
        {
            s[arrNumber]= sc.next().charAt(0);
            res+= s[arrNumber]*Math.pow(31,5-(arrNumber+1));
        }
        System.out.print("문자열 ");
        for (int resNumber=0;resNumber<5;resNumber++)
        {
            System.out.printf("%c",s[resNumber]);
        }
        System.out.printf("의 해시 값은 %.2f입니다.",res);


    }

}
