public class Main {
    public static final int NUM_OF_CLIENT = 8;

    public static void main(String[] args) throws InterruptedException {
        TaxiPool taxiPool = new TaxiPool();
        for (int i = 0; i < NUM_OF_CLIENT; i++) {
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
