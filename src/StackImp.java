import java.util.Stack;

/**
 * Created by rishabhsheoran on 1/27/17.
 */
public class StackImp extends Exception{

    public static int pos=-1,capacity=3;
    Integer[] arr = new Integer[capacity];

    public void push(int a) throws MyException{

        if(pos >= 2) {
            throw new MyException("Stack Overflow");
        } else {
            pos++;
            arr[pos] = a;
        }

    }
    public void pop() throws MyException {
        if(pos<0){
            throw new MyException("Stack Underflow");
        }
        pos--;

    }
    public int top(){
        return arr[pos];
    }

    public static void main(String[] args) {
        StackImp s = new StackImp();
        try {
            s.push(1);
            s.push(2);
            s.push(3);
            System.out.println(s.top());
            s.push(4);
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static class MyException extends Exception {
        MyException(String errorMessage) {
            super(errorMessage);
        }
    }




}

