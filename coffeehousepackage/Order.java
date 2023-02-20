package coffeehousepackage;

import coffeehousepackage.Coffee;

import java.time.LocalDateTime;
public class Order {
    private  static final int MAX_NVISIT=10;
    private Customer customer;
    private Coffee coffee;
    private  int quantity;
    private  LocalDateTime orederDateTime;

    public void takeOrder(Customer cu, Coffee co){
        customer=cu;
        coffee=co;
        this.quantity=1;
        orederDateTime= LocalDateTime.now();
        int v=cu.increasesVisit();
        if(v>MAX_NVISIT){
            System.out.printf("%d order. you get a free coffee",v);
            cu.resetVisit();
        }

    }
    public int charge(){
        int total=quantity*coffee.getPrice();
        System.out.printf("charge: %d\n",total);
        return total;
    }
}
