public class FindString {
    public static void main(String[] args){
        String [] cities ={"New York","Beijing","Seoul"};
        boolean found =false;

        for(String each : cities) {
            if (each.compareTo("Seoul") ==0) {
           // if(each.equals("Seoul")){
                System.out.println(each);
                found=true;
            }
        }
        if(found=false)
            System.out.printf("못찾겠습니다.");
        }
    }


