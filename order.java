public class order {
    int orderID;
    String productName;
    int quantity;
    int price;
    String condition;
    String address;
    order(CustomerOnline co,String productName,int quantity,int price,String condition){
        orderID=co.getId();
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
        this.condition=condition;
    }

}
