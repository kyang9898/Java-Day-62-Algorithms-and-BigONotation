import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        
        String S = "edsab";
        System.out.println(countSort(S));
        System.out.println("In lexicographical order, string will be " + countSort(S) + ".");
    
    }
    
    public static String countSort (String arr){
        StringBuilder string = new StringBuilder();
        char[] countString = arr.toCharArray();
        Arrays.sort(countString);
        
        for(int i = 0; i < countString.length; i++){
            string.append(countString[i]);
        }
        return string.toString();
    }
}