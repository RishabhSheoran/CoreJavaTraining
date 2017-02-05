package GenericQueue;

import java.util.ArrayList;
import java.util.List;

import GenericStack.StackGeneric;

/**
 * Created by rishabhsheoran on 2/5/17.
 */
public class QueueImpl<T> {
    int capacity;
    List<T> queue;
    int front = 1, rear = -1;

    public QueueImpl(int capacity) {
        this.capacity = capacity;
        queue = new ArrayList<T>(capacity);
    }
    public T peek() throws MyExceptions {
        if(queue.isEmpty())
            throw new MyExceptions("queue underflow");
        else
            return queue.get(front);
    }

    public void push(T obj) throws MyExceptions {
        if (rear == -1) {
            front = rear = 0;
            queue.add(rear, obj);
        } else if (rear + 1 >= capacity) {
            throw new MyExceptions("queue overflow");
        } else if (rear + 1 < capacity) {
            rear++;
            queue.add(rear, obj);
        }
    }

    public void pop() throws MyExceptions {
        if (front == -1) {
            throw new MyExceptions("queue underflow");
        } else {
            T obj = queue.get(front);
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
           // return obj;
        }
    }

    public static void main(String[] args) throws MyExceptions {
        QueueImpl<Users> q = new QueueImpl<Users>(3);
        Users user ;
        Users user1 = Users.createInstance(1,"Rishi");
        Users user2 = Users.createInstance(2,"Raw");
        Users user3 = Users.createInstance(3,"Bilal");
        Users user4 = Users.createInstance(4,"Natesh");
        q.push(user1);
        System.out.println(q.peek().getId());
        q.push(user2);
        System.out.println(q.peek().getId());
        q.push(user3);
        System.out.println(q.peek().getId());
       // q.push(user4);
        q.pop();
        System.out.println(q.peek().getId());
        q.pop();
        System.out.println(q.peek().getId());
        q.pop();
        System.out.println(q.peek().getId());

    }

    public static class MyExceptions extends Exception {
        MyExceptions(String errorMessage) {
            super(errorMessage);
        }
    }
}
