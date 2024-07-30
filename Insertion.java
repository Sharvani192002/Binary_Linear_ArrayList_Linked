import java.util.ArrayList;
import java.util.HashSet;
public class Insertion {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(8);
        list1.add(9);
        HashSet<Integer> set=new HashSet<>(list);
        ArrayList<Integer> commonelements= new ArrayList<>();
        for(Integer element :list1){
            if(set.contains(element)){
                commonelements.add(element);

            }
        }
        System.out.println("list1 " + list);
        System.out.println("list2 " + list1);
        System.out.println("common elements " + commonelements);
    }
}
