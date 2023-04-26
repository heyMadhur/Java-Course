package L23_Backtracking;

public class T2_Find_Subsets {

    public static void printSubSets(String str, String newStr) {
        if(0 == str.length()){ 
            System.out.println(newStr);
            return;
        }
        
        char c= str.charAt(0);
        // Character Chooses to Come
        printSubSets(str.substring(1), newStr+c);
        // Character Doesn't Choose to Come
        printSubSets(str.substring(1), newStr);

        
        


        // return str;
    }

    public static void main(String[] args) {
        printSubSets("abc", "");
    }
    
}
