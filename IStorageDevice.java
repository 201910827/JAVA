public class IStorageDevice implements Connection {
    private String ModelName;
    int Capcity;
    IStorageDevice(String n, int c){
        ModelName=n;
        Capcity=c;
    }

    @Override
    public String toString() {
        return "IStorageDevice{" +
                "ModelName='" + ModelName + '\'' +
                ", Capcity=" + Capcity +
                '}';
    }

    public  static void main(String[] args){
        ExternalHDD ex =new ExternalHDD(512,2);
        internalhdd ih =new internalhdd(1024,4);
        System.out.println(ex);
        System.out.println(ih);
    }
}
