package ProducerConsumer;

import java.util.concurrent.BlockingQueue;

/**
 * Created by rishabhsheoran on 2/6/17.
 */
public class Producer implements Runnable{
    private BlockingQueue sharedQueue;
    public Producer(BlockingQueue sharedQueue){
        this.sharedQueue=sharedQueue;
    }
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try{
                System.out.println("Produced:   "+i);
                sharedQueue.put(i);
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
