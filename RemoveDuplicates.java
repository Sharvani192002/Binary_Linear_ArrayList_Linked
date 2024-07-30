import java.util.ArrayList;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(5);
        LinkedHashSet<Integer> set= new LinkedHashSet<>(list);
        ArrayList<Integer> resultlist=new ArrayList<>(set);
        System.out.println("original list: " + list);
        System.out.println("List after removing duplicates: " + resultlist);
    }


}
