/*
public class Mitermrandom {
    final int MAX_RANDOM=10;
    String carType[];
    TrafficLaw trafficType[];
    int fine[];
    Mitermrandom(){
        carType=new String[MAX_RANDOM];
        trafficType=new TrafficLaw[MAX_RANDOM];

        fine=new int[MAX_RANDOM];
    }
    void makeRandom(){
       ;

        for(int i=0; i<MAX_RANDOM;i++){

            int cartypeNum= (int) Math.floor(Math.random()*3);
            int trafficTypeNum= (int) Math.floor(Math.random()*9);

            switch (trafficTypeNum){
                case 0: trafficType[i]=TrafficLaw.LIGHT;break;
                case 1: trafficType[i]=TrafficLaw.PEDSTRAN;break;
                case 2: trafficType[i]=TrafficLaw.YELLOW;break;
                case 3: trafficType[i]=TrafficLaw.BUSONLYHIGHWAY;break;
                case 4: trafficType[i]=TrafficLaw.LANE;break;
                case 5: trafficType[i]=TrafficLaw.OVER60;break;
                case 6: trafficType[i]=TrafficLaw.OVER4060;break;
                case 7: trafficType[i]=TrafficLaw.OVER2040;break;
                case 8: trafficType[i]=TrafficLaw.OVER20;break;
            }
            switch (cartypeNum){
                case 0: carType[i]="VAN";
                        fine[i]=trafficType[i].getVAN();break;
                case 1: carType[i]="CAR";
                         fine[i]=trafficType[i].getCAR();break;
                case 2: carType[i]="AUTO";
                        fine[i]=trafficType[i].getAUTO();break;
            }


            }


        }

        void printRandom(){
        for(int i=0;i<10;i++){
            System.out.printf("car: %s, violaiton: %s, fine: %d\n",carType[i],trafficType[i],fine[i]);
        }

    }
}
*/
