import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        int size= list.size();
        for(int i=0;i<size/2;i++){
            Integer temp= list.get(i);
            list.set(i, list.get(size-1-i));
            list.set(size-1-i,temp);
        }
        System.out.println("Reversed list: " + list);
    }
}
