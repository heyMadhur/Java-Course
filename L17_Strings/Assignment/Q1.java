package L17_Strings.Assignment;

public class Q1 {

    public static void countLowerVowels(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                count++;
        }
        System.out.println("No. of Lowercase Vowels= "+count);
    }
    
    public static void main(String[] args) {
        // Q1 Count how many times lowercase vowels occurred in a String entered by the user.
        
        countLowerVowels("Hi I am Madhur Gupta....");

    }
    
}
