package LinearSearch;
public class AllOccurance {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 35, 40, 20};
        int[] visited = new int[array.length];
        int flag = -1;
        for(int i=0;i<array.length;i++){
            if(visited[i]==flag)
                continue;
            int count=0;
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    count++;
                    visited[j]=flag;
                }

            }
            System.out.println(array[i] + " count " + count);
        }
    }

}



