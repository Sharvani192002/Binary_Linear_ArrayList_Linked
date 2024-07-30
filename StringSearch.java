package LinearSearch;
public class StringSearch {
    public static int searchstring(String[] S, String key){
        for(int i=0;i<S.length; i++){
            if(S[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String [] string={"ape", "ball", "cat","dog"};
        String key="dog";
        System.out.println("The key is " + searchstring(string,key));
    }
}


