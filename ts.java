public class ts {
    enum lightcolor {
        RED(30),AMBER(10),GREEN(100);

        int time;

        lightcolor (int n){
            time=n;
        }
        int gettime () {
            return time;
        }

    }
    public static void main(String[] args){
        
        for(lightcolor tss:lightcolor.values()){
            System.out.printf("신호색상 : %s  시간 %d",tss,tss.gettime());
        }

    }
}
