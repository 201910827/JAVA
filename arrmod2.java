import java.util.Scanner;
public class arrmod2 {
    public static void main(String[] args)
    {
        String strArray = "Let's meet in my office at 10";
        Scanner sc= new Scanner(System.in);
        System.out.printf("원본 문장: %s\n",strArray);
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요:");
        String oldWord = sc.nextLine();
        System.out.println("새로운 문자열을 입력하세요:");
        String newWord = sc.nextLine();
        int startIndex= strArray.indexOf(oldWord);     // 문장내의 바꾸고 싶은 문자의 시작 인덱스
        String frontStr=strArray.substring(0,startIndex); // 처음부터 바꾸고 싶은 문자열 -1 인덱스 까지 복사한 문자열
        int oldWordLength = oldWord.length();             // 바꾸고싶은 문자열의 길이
        String rearStr= strArray.substring(startIndex + oldWordLength);//(시작 인덱스 + 바꾸고싶은 문자열 길이) 부터 문장끝까지 복사
        System.out.printf("새로운 문장: %s%s%s",frontStr,newWord,rearStr);   //(문장의 처음 ~ 바꾸고싶은 문자열 -1) + 새로운문자열 + 바꾸고싶은 문자열의 끝+1~ 문장의 끝
    }


}
//                 replace 함수를 사용한 코드
/*
        String strArray = "Let's meet in my office at 10";
        Scanner sc= new Scanner(System.in);
        System.out.printf("원본 문장: %s\n",strArray);
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요:");
        String str1 = sc.nextLine();
        System.out.println("새로운 문자열을 입력하세요:");
        String str2 = sc.nextLine();
        strArray=strArray.replace(str1,str2);
        System.out.printf("새로운 문장: %s",strArray);

 */