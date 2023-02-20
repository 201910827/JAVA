/*
enum TrafficLaw{ LIGHT(8,7,5),PEDSTRAN(8,7,5),YELLOW(10,9,0)
    ,BUSONLYHIGHWAY(10,9,0),LANE(4,4,3), OVER60(14,13,9)
    ,OVER4060(11,10,7),OVER2040(8,7,5),OVER20(4,4,3);
    int VAN;
    int CAR;
    int AUTO;

    TrafficLaw(int van, int car, int auto){
        this.VAN=van;
        this.CAR=car;
        this.AUTO=auto;
    }
    int getVAN(){return VAN;}
    int getCAR(){return CAR;}
    int getAUTO(){return AUTO;}

}
public class minterm2019 {
    public static void main (String[] args){
        int [] case123 = {TrafficLaws.OVER2040.getAUTO(),TrafficLaws.LIGHT.getVAN()+TrafficLaw.YELLOW.getVAN()
                ,TrafficLaws.BUSONLYHIGHWAY.getCAR()+TrafficLaw.OVER60.getCAR()};
        for(int i=0;i<3;i++){
            System.out.printf("CASE %d: fine: %d\n",i,case123[i]);
        }
        System.out.printf("\n\n");
        Mitermrandom MR=new Mitermrandom();
        MR.makeRandom();
        MR.printRandom();


    }

}
*/
