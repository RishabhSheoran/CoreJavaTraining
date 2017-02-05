package GenericQueue;

/**
 * Created by rishabhsheoran on 2/5/17.
 */
public class Users {
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
    public static Users createInstance(int id, String name){
        Users u = new Users();
        u.setId(id);
        u.setName(name);
        return u;
    }
}
