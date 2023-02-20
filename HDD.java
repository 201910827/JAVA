public class HDD extends IStorageDevice{
    int RPM;
    HDD(int r, int s){
        super("HDD",s);
        RPM=r;
    }
    HDD(String name, int r, int s){
        super(name,s);
        RPM=r;

    }

    @Override
   public String toString(){
        return super.toString()+RPM;
    }
}
