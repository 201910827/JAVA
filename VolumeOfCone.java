import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1, r2, height;
        double pai = 3.14;
        double ans;         //원뿔대의 부피
        System.out.println("작은 원의 반지름을 입력하시오");
        r1 = sc.nextDouble();
        System.out.println("큰 원의 반지름을 입력하시오");
        r2 = sc.nextDouble();
        System.out.println("원뿔때의 높이를 입력하시오");
        height = sc.nextDouble();
        ans=(1./3.)*pai*height*(r1*r1+r1*r2+r2*r2);
        System.out.printf("원뿔때의 부피는 %f 입니다", ans);


    }
}
