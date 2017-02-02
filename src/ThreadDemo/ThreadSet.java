package ThreadDemo;

/**
 * Created by rishabhsheoran on 2/1/17.
 */
public class ThreadSet implements Runnable {
    Client c;
    public ThreadSet(Client c) {
        this.c= c;
    }
    public  void run(){
        c.setX(1);
        System.out.println("in tset");
    }
}
