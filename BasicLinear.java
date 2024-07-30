

public class BasicLinear {
    public static int linear(int []arr,int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a={12,34,5,6,8};
        int key= 6;
        System.out.println("The key is:" + linear(a,key));
    }
}
