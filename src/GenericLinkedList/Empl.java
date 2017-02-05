package GenericLinkedList;

/**
 * Created by rishabhsheoran on 2/6/17.
 */
public class Empl {
    private int id;
    private String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Empl createInstance(int id, String name){
        Empl e = new Empl();
        e.setId(id);
        e.setName(name);
        return e;
    }
}
