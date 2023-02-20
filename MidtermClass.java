//Midterm-Class
//201910782 KimSeongeun

class print_s{
    static void Fine() {
        int randomtype,randomvio, sum=0;
        for(int i=0; i<10; i++) {
            randomvio=(int)Math.floor(Math.random()*9)+1;   //violation type
            randomtype=(int)Math.floor(Math.random()*3)+1;	//carType
            if(randomtype==1){
                System.out.printf("car: VAN, ");
            }else if(randomtype==2){
                System.out.printf("car: CAR, ");
            }else if(randomtype==3){
                System.out.printf("car: AUTO, ");
            }
            switch(randomtype) {
                case 1:
                    Result1(randomvio);
                    System.out.println(Result(randomvio).getVAN());
                    sum+=Result(randomvio).getVAN();
                    break;
                case 2:
                    Result1(randomvio);
                    System.out.println(Result(randomvio).getCAR());
                    sum+=Result(randomvio).getCAR();
                    break;
                case 3:
                    Result1(randomvio);
                    System.out.println(Result(randomvio).getAUTO());
                    sum+=Result(randomvio).getAUTO();
                    break;
            }
        }
        System.out.println("Total fine: " + sum);  //total fine
    }
    
    static TrafficLaws Result (int n) {		  //Each enum's name
        switch(n) {
            case 1:
                return TrafficLaws.LIGHT;
            case 2:
                return TrafficLaws.PEDESTRIAN;
            case 3:
                return TrafficLaws.YELLOW;
            case 4:
                return TrafficLaws.BUSONLYHIGHWAY;
            case 5:
                return TrafficLaws.LANE;
            case 6:
                return TrafficLaws.OVER60;
            case 7:
                return TrafficLaws.OVER4060;
            case 8:
                return TrafficLaws.OVER2040;
            case 9:
                return TrafficLaws.OVER20;
        }
        return null;
    }

    static void Result1 (int n) {
        switch(n) {
            case 1:
                System.out.printf("violation: LIGHT, fine: ");
                break;
            case 2:
                System.out.printf("violation: PEDESTRIAN, fine: ");
                break;
            case 3:
                System.out.printf("violation: YELLOW, fine: ");
                break;
            case 4:
                System.out.printf("violation: BUSONLYHIGHWAY, fine: ");
                break;
            case 5:
                System.out.printf("violation: LANE, fine: ");
                break;
            case 6:
                System.out.printf("violation: OVER60, fine: ");
                break;
            case 7:
                System.out.printf("violation: OVER4060, fine: ");
                break;
            case 8:
                System.out.printf("violation: OVER2040, fine: ");
                break;
            case 9:
                System.out.printf("violation: OVER20, fine: ");
                break;
        }
    }
}
