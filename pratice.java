import java.util.Scanner;
public class pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        /* do{
           System.out.printf("정수를 입력하세요\n");
           num=sc.nextInt();
           if(num!=0)
               System.out.printf("%d\n",num);
           else break;
       } while(true);
    }*/
        System.out.printf("정수를 입력하세요\n");
        num = sc.nextInt();
        for (;  num<100; num = sc.nextInt()) {
            if (num == 0) {
                System.out.printf("다시정수를 입력하세요\n");
                continue;
            }
            System.out.printf("정수를 입력하세요\n");
        }
    }
}