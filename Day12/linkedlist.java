import java.util.*;
import java.util.LinkedList;
public class linkedlist{
    public static void main(String[] args){
        LinkedList<Integer> linkedlist=new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        System.out.println(linkedlist);
        linkedlist.addFirst(5);
        linkedlist.addLast(40);
        System.out.println(linkedlist);
        linkedlist.add(2,15);
        System.out.println(linkedlist);
        System.out.println(linkedlist.get(3));
        linkedlist.remove(2);
        System.out.println(linkedlist);
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println(linkedlist);
        System.out.println(linkedlist.size());
        System.out.println(linkedlist.contains(20));// checks if the value is present in the list
        //check the index of the value
        System.out.println(linkedlist.indexOf(20));
        //check the last index of the value
        System.out.println(linkedlist.lastIndexOf(20));
        //check if a value is present in a particular range
        System.out.println(linkedlist.subList(0,2));
        //check if a value is presnet in a particular index
        System.out.println(linkedlist.get(1));
       


    }
}