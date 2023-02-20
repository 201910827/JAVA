/*MidtermMain
201910782 KimSeongeun*/
enum TrafficLaws {LIGHT(9,8,4)/*before modification: LIGHT(8,7,5)*/, PEDESTRIAN(8,7,5), YELLOW(10,9,0), BUSONLYHIGHWAY(10,9,0), LANE(4,4,3), OVER60(14,13,9), OVER4060(11,10,7), OVER2040(12,11,8)/*before modification"OVER2040(8,7,5)*/, OVER20(4,4,3);
    int VAN;
    int CAR;
    int AUTO;

    TrafficLaws(int VAN, int CAR, int AUTO){
        this.VAN=VAN;
        this.CAR=CAR;
        this.AUTO=AUTO;
    }

    int getVAN() {
        return VAN;
    }

    int getCAR() {
        return CAR;
    }

    int getAUTO() {
        return AUTO;
    }
}

public class MidtermMain {
    static print_s ce=new print_s(); //Call a class about violation print code.
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TrafficLaws Case1fine=TrafficLaws.OVER2040;
        TrafficLaws Case2fine1=TrafficLaws.LIGHT, Case2fine2=TrafficLaws.YELLOW;
        TrafficLaws Case3fine1=TrafficLaws.BUSONLYHIGHWAY, Case3fine2=TrafficLaws.OVER60;

        System.out.println("CASE1: fine: " + Case1fine.getAUTO());  //Case1's fine
        System.out.println("CASE2: fine: " + (Case2fine1.getVAN()+Case2fine2.getVAN()));  //Case2's fine
        System.out.println("CASE3: fine: " + (Case3fine1.getCAR()+Case3fine2.getCAR()));  //Case3's fine

        //------RANDOM PRINT------
        ce.Fine();
    }
}

