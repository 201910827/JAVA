public class CustomerOnline {
    int id;
    String name;
    String number;
    String address;
    double point;
    CustomerOnline(int id, String name,String number,String adress){
        this.id=id;
        this.name=name;
        this.number=number;
        this.address=adress;
        point=0.0;
    }

    public String getName() {
        return name;
    }

    public double getPoint() {
        return point;
    }

    public int getId() {
        return id;
    }

    public String getAdress() {
        return address;
    }

}
