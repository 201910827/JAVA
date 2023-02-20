import java.util.Scanner;
public class SumNum{
  public static void main (String[] args){
    Scanner sc =new Scanner(System.in);
    String Fh=sc.next();
    double cs=( Double.parseDouble(Fh)-32)*(5./9);
    System.out.printf("result = %.2f",cs);
    }
 }