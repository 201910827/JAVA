import java.util.Scanner;
public class arrmod {
    public static void main(String[] args)
    {
        String strArray = "Let's meet in my office at 10";
        Scanner sc= new Scanner(System.in);
        System.out.printf("원본 문장: %s\n",strArray);
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요:");
        String str1 = sc.nextLine();
        System.out.println("새로운 문자열을 입력하세요:");
        String str2 = sc.nextLine();
        strArray=strArray.replace(str1,str2);
        System.out.printf("새로운 문장: %s",strArray);

    }

}
