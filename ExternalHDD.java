public class ExternalHDD extends HDD implements Connection{
        public  void connected(){
            System.out.println("USB에 연결됨");
        }

        ExternalHDD(int s,int r){
            super("Exterhdd",s, r);
        }


}
