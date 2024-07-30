package SortingAlgorithms;

public class InsertionSort {
    public static void insertionsort(int []arr){
        int n=arr.length;
        for(int j=1; j<n;j++){
            int key=arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
    }

    public static void main(String[] args) {
        int [] arr1={9,14,5,13,26,56,4};
        System.out.print("Before Sorting ");
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();
        insertionsort(arr1);
        System.out.print("after insertion ");
        for(int i :arr1){
            System.out.print(i+ " ");
        }
    }
}
