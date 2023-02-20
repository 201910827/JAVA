import java.util.Scanner;
public class minterm20 {
    enum Faretype{
        ADULT(1200),YOUTH(720),CHILD(450),TRANSFER(0);
        int fare;
        Faretype(int f){
            fare=f;
        }
        int getFare(){return fare;}
    }
    static class busfare{
        final int MAX_PASSENGER=100;
        final int MAX_TRANSFER=5;
        final int BASIC_FARE_DISTANCE=10;
        final int DISTACE_ADD_KM=5;
        final int ADD_PRICE=100;

        int seq[];
        String type[];
        int nTransfer[];
        float distanceTravevled[];
        int fare[];

        busfare(){
            seq=new int[MAX_PASSENGER];
            type=new String[MAX_PASSENGER];
            nTransfer=new int[MAX_PASSENGER];
            distanceTravevled=new float[MAX_PASSENGER];
            fare=new int[MAX_PASSENGER];
        }

        void getInput(String p){
            Scanner sc = new Scanner(p);
                int i= sc.nextInt();
                if(i>=0 && i<=11) {
                    seq[i] = i;
                    type[i] = sc.next().toUpperCase();
                    nTransfer[i] = sc.nextInt();
                    String a = sc.next();
                    distanceTravevled[i] = Float.parseFloat(a.substring(0, a.indexOf("km")));
                    computeFare(seq[i],type[i],nTransfer[i],distanceTravevled[i]);
                }


        }
        void printData(){
            for(int i=0; i<11;i++)
            {
                System.out.printf("... boarding %d %s transfer %d for %.2fkm\n",seq[i],type[i],nTransfer[i],distanceTravevled[i]);
            }
        }
        int computeFare(int seq,String type, int ntransfer,float distanceTraveled){
            int transfare=0;
            Faretype ft=Faretype.valueOf(type);
            switch(ft){
                case ADULT:
                case CHILD:
                case YOUTH:
                    transfare= ft.getFare();
                    break;
                case TRANSFER:
                    if((int)distanceTraveled<=10)
                        transfare=0;
                    else
                        transfare=((int)distanceTraveled-10)/DISTACE_ADD_KM * ADD_PRICE;
            }
            fare[seq]=transfare;
            return transfare;
        }


        void printPassenger_first(){
            System.out.printf(" seq   type  n transfer distance travelled  fare\n");
            System.out.printf("_____ __________ __________ _________________ _________\n");
            int sum=0;
            for(int i=0;i<11;i++){
                System.out.printf("%5d %10s %10d %14.2f km %,6d won \n",
                        seq[i],type[i],nTransfer[i],distanceTravevled[i],fare[i]);
                sum+=fare[i];
            }
            System.out.printf("_________________________________________________________\n");
            System.out.printf("%,32d won",sum);



        }

        void printBy(Faretype ft){

            int sum=0;
            System.out.printf(" seq   type  n transfer distance travelled  fare\n");
            System.out.printf("_____ __________ __________ _________________ _________\n");
            for(int i=0; i<11;i++){

            }
        }




    }

    public static void main (String[] args)
    {
        busfare bf=new busfare();
        String data[]={
                "0 Adult 0 12.5km",

                "1 youth 0 9.0km",

                "2 Child 0 9.0km",

                "3 Transfer 1 13.0km",

                "4 child 0 14.2km",

                "5 Transfer 4 55.5km",

                "6 adult 0 18.0km",

                "7 youth 0 11.2km",

                "8 transfer 3 20.0km",

                "9 transfer 4 56.0km",

                "10 transfer 2 32.3km"};
            for(String each:data){
                bf.getInput(each);
            }
            bf.printData();

            bf.printPassenger_first();
    }
}
