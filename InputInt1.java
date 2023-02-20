import java.util.Scanner;
public class InputInt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int num =1;num!=0;){
            System.out.println("숫자입력 0시 아웃");
            num=sc.nextInt();
        }
    }
}
