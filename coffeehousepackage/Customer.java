package coffeehousepackage;

public class Customer {
    private String name;
    private  String phoneNo;
    private  int visit;
    public Customer(String name,String phoneNo){
        this.name=name;
        this.phoneNo=phoneNo;
        visit=0;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public int increasesVisit(){
        visit++;
        return visit;
    }
    public void resetVisit(){visit =0;}

}
