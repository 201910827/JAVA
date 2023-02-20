import java.util.Scanner;

public class InputBuffer {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("Input str:"+s);
        int num=sc.nextInt();
        System.out.printf("input numberS "+num);
        String s1= sc.nextLine();
        System.out.println("나머지 문자열:" +s1);
    }
}
