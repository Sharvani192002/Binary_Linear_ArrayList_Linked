package LinearSearch;
public class Maximum {
    public static void main(String[] args) {
        int [] array={12,14,16,18,20};
        int max=array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);


    }
}

