import java.util.*;
import java.util.ArrayList;
public class ArrayImplementation{
    public static void main(String[] args){
        new ArrayList<>();
        ArrayList<Integer> arrlist= new ArrayList<>();
        List<Integer> list2=new ArrayList<>();//incase we are not sure about the implementation( liked linked list) just declare generic List
        arrlist.add(null);
        arrlist.add(10);
        arrlist.add(20);
        System.out.println(arrlist);
        arrlist.set(0,100);
        arrlist.add(1,50);//doesn't replace just shifts the value
        System.out.println(arrlist);
        System.out.println(arrlist.get(2));
        arrlist.remove(1);
        System.out.println(arrlist);
        System.out.println(arrlist.size());
        System.out.println(arrlist.contains(20));
        System.out.println(arrlist.indexOf(20));
        System.out.println(arrlist.isEmpty());
        System.out.println(arrlist.indexOf(100));
        System.out.println(arrlist.lastIndexof(100));//last occurance of a value
        System.out.println(arrlist.subList(0,2));//slicing
        System.out.println(arrlist.toArray());
        arrlist.clear();
        System.out.println(arrlist);
    }
}