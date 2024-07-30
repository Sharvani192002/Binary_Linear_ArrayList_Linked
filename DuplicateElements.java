import java.util.ArrayList;
import java.util.HashSet;
public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(7);
        list.add(4);
        HashSet<Integer> uniqueElements= new HashSet<>();
        HashSet<Integer> DuplicateElements= new HashSet<>();
        HashSet<Integer> Elements= new HashSet<>();
        for(Integer element: list){
            if(!uniqueElements.add(element)){
                DuplicateElements.add(element);
            }
        }
        System.out.println("Duplicate Elements: " + DuplicateElements);
    }
}
