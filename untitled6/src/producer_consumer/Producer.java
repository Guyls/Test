package producer_consumer;

public class Producer {

    Goods goods;

    @Override
    public void run(){
        for (int i = 1; i<10; i++){
            try   catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Produit"+goods.amount);

        }
    }

    public void start() {

    }
}