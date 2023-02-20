import coffeehousepackage.*;

public class TestCoffeeHouse {
    public static void main(String[] args){
        CoffeeHouse ch=new CoffeeHouse("아마스빈","010-123-123","평창동");
        Customer cs = new Customer("이학진","010-5625-4267");
        Coffee coffee =new Coffee("아메리카노",3000);
        Order od=new Order();
        int totalcharge=0;
        for(int i=0; i<12;i++){
            od.takeOrder(cs,coffee);
            ch.addOrder(od);
            totalcharge+=od.charge();
        }
        System.out.printf("총금액은 %d\n",totalcharge);

    }
}
