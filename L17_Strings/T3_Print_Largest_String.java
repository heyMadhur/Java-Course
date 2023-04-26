package L17_Strings;

public class T3_Print_Largest_String {

    public static void printLargestString(String [] arr) {
        String largest=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(largest.compareTo(arr[i])<0) 
                largest=arr[i];
        }

        System.out.println("Largest String(Lexicographic wise)= "+largest);
        
    }
    
    
    public static void main(String[] args) {

        // For a given set of Strings, print the largest string (Lexicographic wise).
        // Lexicographic order= compare alphabet wise

        String [] strArr= {"apple", "banana","mango"};
        printLargestString(strArr);
        
    }
}
