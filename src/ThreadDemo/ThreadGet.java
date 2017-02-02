package ThreadDemo;

/**
 * Created by rishabhsheoran on 2/1/17.
 */
public class ThreadGet implements Runnable {
    Client c;

    public ThreadGet(Client c) {
        this.c= c;
    }
    public void  run(){
        System.out.println("id is :"+c.getX() + " in tget");

    }
}
