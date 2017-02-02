package ThreadDemo;

/**
 * Created by rishabhsheoran on 2/1/17.
 */
public class Client {
   private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Client c = new Client();
        ThreadGet tg = new ThreadGet(c);
        Thread tget = new Thread(tg);
        ThreadSet ts = new ThreadSet(c);
        Thread tset = new Thread(ts);
        tget.start();
        tset.start();
        try {
            tset.join();
            tget.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in main");
    }
}
