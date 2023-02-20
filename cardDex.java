public class cardDex {
    String shape;
    int[] cards;
    int count = 3;

    cardDex() {
        shape = "Diamond";
        cards = new int[count];
        for (int i = 0; i < 3; i++) {
            cards[i] = (int) Math.floor(Math.random() * 9) + 2;

        }
    }

    void deal() {
        count--;
        System.out.printf("꺼낸  카드의 shape = %s,number = %d\n 남은 카드의 수는 %d \n", shape, cards[count],count);
    }

    public static void main(String[] args) {
        cardDex card = new cardDex();
        for (int i = 0; i < 3; i++)
            card.deal();

    }
}