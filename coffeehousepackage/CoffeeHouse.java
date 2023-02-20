package coffeehousepackage;

public class CoffeeHouse {
    private static  final int MAX_OREDER=100;
    private  String name;
    private  String phoneNo;
    private  String address;
    private int nOreder;
    private  int nlike;
    private  Order[] orders;
    public CoffeeHouse(String name,String phNO,String addr){
        this.name=name;
        phoneNo=phNO;
        address=addr;
        orders = new Order[MAX_OREDER];
        nOreder=0;
        nlike=0;

    }
    public int incresaseLike(){
        nlike++;
        return nlike;
    }
    public void addOrder(Order order){
        if(nOreder<MAX_OREDER) {
            orders[nOreder] = order;
            nOreder++;
        }
    }


}
