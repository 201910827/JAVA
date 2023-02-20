public class cardDex_2_class {
    cardDex_1_class[] cards;
    int count =0;

    cardDex_2_class(){
        cards = new cardDex_1_class[3];
        for(int i=0;i<cards.length;i++)
        {
            cards[i]= new cardDex_1_class((int) Math.floor(Math.random() * 9) + 2);

        }
    }

    void deal ()
    {

        System.out.printf(" shape= %s , number = %d\n 남은 카드수 = %d\n",cards[count].getShape(),cards[count].getNumber(),2-count);
        count ++;
    }

    public static void main(String[] args)
    {
        cardDex_2_class cardDex = new cardDex_2_class();
        for (int i=0; i<3;i++)
        {
            cardDex.deal();
        }
    }

}
