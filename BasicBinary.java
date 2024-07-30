package BinarySearch;
import com.sun.tools.javac.Main;

public class BasicBinary {
    public static void binarysearch(int[] arr, int first, int key, int last) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element not found");
        }
    }

    public static void main (String[]args){
        int arr[] = {2, 3, 4, 5, 6, 7};
        int key = 5;
        int last = arr.length - 1;
        binarysearch(arr, 0, last, key);

    }

}


