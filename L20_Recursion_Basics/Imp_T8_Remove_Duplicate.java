package L20_Recursion_Basics;

import java.util.HashSet;

public class Imp_T8_Remove_Duplicate {

    public static HashSet<Character> hset= new HashSet<>();
    public static boolean [] map= new boolean[26];  

    public static String removeDuplicate(String str, int i) {
        if(i==str.length()){
            return "";
        }
        char c= str.charAt(i);
        if(!(map[c-'a'])){
            map[c-'a']=true;
            return c+ removeDuplicate(str, i+1);
        }
        return removeDuplicate(str, i+1);
    }

    public static void main(String[] args) {

        String str= "hhheeeeeeeeyyyyybbbrrrrrroooooo";
        System.out.println(removeDuplicate(str, 0));


        
    }
    
}
