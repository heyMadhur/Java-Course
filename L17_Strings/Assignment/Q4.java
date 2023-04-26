package L17_Strings.Assignment;

import java.util.Arrays;

public class Q4 {

    public static boolean checkAnagrams(String str1, String str2) {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()) return false;

        // Making frequency of String 1
        int str1Freq[]= new int[26];
        for (int i = 0; i < str1.length(); i++) {
            str1Freq[str1.charAt(i)-'a']++;
        }

        // Making frequency of String 1
        int str2Freq[]= new int[26];
        for (int i = 0; i < str1.length(); i++) {
            str2Freq[str2.charAt(i)-'a']++;
        }

        for (int i = 0; i < str2Freq.length; i++) {
            if(str1Freq[i]!= str2Freq[i]) return false;
        }
        
        return true;
    }

    public static boolean checkAnagrams_Method2(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()) return false;

        char [] str1CharArr= str1.toCharArray();
        char [] str2CharArr= str2.toCharArray();
        
        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);

        if(Arrays.equals(str1CharArr, str2CharArr)) return true;
        else return false;

    } 
    
    public static void main(String[] args) {

        // Q4 Determine if 2 Strings areanagramsof each other.
        // What are anagrams?
        // If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a care, or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.
        System.out.println(checkAnagrams("Care", "race"));
        System.out.println(checkAnagrams_Method2("Care", "race"));

    }
    
}
