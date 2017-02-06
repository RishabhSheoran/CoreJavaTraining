package ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by rishabhsheoran on 2/6/17.
 */
public class MainProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue sharedQueue = new ArrayBlockingQueue(3);
        Producer p = new Producer(sharedQueue);
        Thread pt = new Thread(p);
        Consumer c = new Consumer(sharedQueue);
        Thread ct = new Thread(c);
        pt.start();
        ct.start();
    }
}
