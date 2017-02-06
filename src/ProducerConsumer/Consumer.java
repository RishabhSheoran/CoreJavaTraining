package ProducerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by rishabhsheoran on 2/6/17.
 */
public class Consumer implements Runnable{
    private BlockingQueue sharedQueue;
    public Consumer(BlockingQueue sharedQueue){
        this.sharedQueue=sharedQueue;
    }
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumed:   "+ sharedQueue.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
