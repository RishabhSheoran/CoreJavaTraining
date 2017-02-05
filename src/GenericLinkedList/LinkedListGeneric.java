package GenericLinkedList;

import java.util.LinkedList;

/**
 * Created by rishabhsheoran on 2/5/17.
 */
public class LinkedListGeneric<T> {
    public Node<T> start;
    public LinkedListGeneric(){
        start=null;
    }
    public Node<T> getStart(){
        return start;
    }
    public void addElementAtStart(T obj){
        Node<T> node = new Node<T>();
        node.setData(obj);
        Node<T> temp = start;
        start=node;
        start.setNext(temp);

    }
    public void addAfterPosition(int position, T obj){
        if(position<1){
            return;
        }
        int count=1;
        Node<T> ptr = start;
        Node<T> ptr1=new Node<T>();
        ptr1.setData(obj);
        while(count!=position){
            ptr = ptr.getNext();
            count++;
        }
        ptr1.setNext(ptr.getNext());
        ptr.setNext(ptr1);
    }
    public void deleteAtPosition(int position){
        int count =1;
        Node<T> ptr=start;
        Node<T> ptr1 = null;
        while(count<position){
            ptr=ptr.getNext();
            count++;
        }
        ptr1=ptr.getNext();
        ptr.setNext(ptr1.getNext());
        ptr1.setNext(null);
    }
    public T getElementAtPosition(int pos){
        T obj;
        int count=1;
        Node<T> ptr=start;
        while (count!=pos){
            ptr=ptr.getNext();
            count++;
        }
        return ptr.getData();
    }
    public static void main(String[] args) {
        LinkedListGeneric<Empl> list = new LinkedListGeneric<>();
        Empl e1 = Empl.createInstance(1,"Raw");
        Empl e2 = Empl.createInstance(2,"Bilal");
        Empl e3 = Empl.createInstance(3,"Natesh");
        Empl e4 = Empl.createInstance(4,"Rishi");
        list.addElementAtStart(e1);
        System.out.println(list.getElementAtPosition(1).getId());
        list.addAfterPosition(1,e2);
        System.out.println(list.getElementAtPosition(2).getId());
        list.addElementAtStart(e3);
        list.addElementAtStart(e4);
        System.out.println(list.getElementAtPosition(1).getId());
        Node<Empl> pt = list.getStart();
        while(pt!=null){
            Empl e=pt.getData();
            System.out.println(e.getId()+e.getName());
            pt=pt.getNext();
        }
        list.deleteAtPosition(1);
        Node<Empl> p = list.getStart();
        while(p!=null){
            Empl e=p.getData();
            System.out.println(e.getId()+e.getName());
            p=p.getNext();
        }
    }

}
