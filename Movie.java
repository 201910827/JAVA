import java.util.Scanner;
public class Movie {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("무엇을 구매 할지 선택하세요 prime, standard , economy:");
        String zone = sc.next();
        /*if(zone.compareTo("prime")==0)
            System.out.printf("가격은 11000원");
        else if(zone.compareTo("standard")==0)
            System.out.printf("가격은 10000원");
        else if(zone.compareTo("economy")==0)
            System.out.printf("가격은 9000원");*/
        switch (zone){
            case "prime":
                System.out.println("11000원"); break;
            case "standard":
                System.out.println("11000원"); break;
            case "economy":
                System.out.println("11000원"); break;
            default:
                System.out.println("잘못입력"); break;
        }
    }

}
