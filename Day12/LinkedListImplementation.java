import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListImplementation{
    Node head;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }

    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void remove(int data){
        if(head==null){
            return;
        }
        else if(head.data==data){
            head=head.next;
            return;
}
    }
        Node current=head;
        while(current.next!=null){
            if(current.next.data==data){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }
    public int size(){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }               
    }
        return count;
    
    public boolean contains(int data){
        Node current=head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public static void main(String[] args){
        LinkedListImplementation list=new LinkedListImplementation();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        list.remove(20);
        list.display();
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.contains(30));
    }

