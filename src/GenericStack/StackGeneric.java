package GenericStack;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by rishabhsheoran on 2/1/17.
 */
public class StackGeneric<T>{
    public final int capacity=3;
    public int pos=-1;
    List<T> stack = new ArrayList<T>(capacity);

    public void push(T item) throws MyException {
        if(pos>=capacity-1){
            throw new MyException("Stack Overflow");
        }
        pos++;
        stack.add(item);
    }

    public void pop() throws MyException {
        if(pos<0){
            throw new MyException("Stack Underflow");
        }
        stack.remove(pos);
        pos--;
    }

    public T top(){
        T t;
        t=stack.get(pos);
        return t;
    }

    public static void main(String[] args) throws MyException {
     StackGeneric<User> i =new StackGeneric<>();
     User u1=User.createInstance(1,"rishi");
     User u2=User.createInstance(2,"sh");
     User u3=User.createInstance(3,"ab");
     User u4=User.createInstance(4,"fab");
     //i.pop();
     i.push(u1);
     System.out.println(i.top().getId());
     i.push(u2);
     System.out.println(i.top().getId());
     i.push(u3);
     System.out.println(i.top().getId());
     /*i.push(u4);
     System.out.println(i.top().getId());*/
     i.pop();
     System.out.println(i.top().getId());

    }
    public static class MyException extends Exception {
        MyException(String errorMessage) {
            super(errorMessage);
        }
    }
}

