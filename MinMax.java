import java.util.ArrayList;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(27);
        list.add(56);
        if(list.isEmpty()){
            System.out.println("The list is empty");
            return;
        }
        int min= list.get(0);
        int max= list.get(0);
        for(int i=1; i<list.size(); i++){
            int current=list.get(i);
            if(current<min){
                min=current;
            }
            if(current>max){
                max=current;
            }
        }
        System.out.println("list: " + list);
        System.out.println("Minimum Number: " + min);
        System.out.println("Minimum Number: " + max);
    }
}
