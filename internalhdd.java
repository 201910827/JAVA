public class internalhdd extends HDD {

    public  void connected(){
        System.out.println("sata에 연결됨");
    }

    internalhdd(int s,int r){
        super("interhdd",s, r);
    }

}
