package L17_Strings;

public class T4_Capitalize_First_Letter_of_each_Word {

    public static void capitalizeFirstLetter(String str) {
        StringBuilder sb= new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1)==' ' && Character.isAlphabetic(str.charAt(i))){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
    
    public static void main(String[] args) {

        String str= "hi, i am madhur gupta";
        capitalizeFirstLetter(str);        
        
    }
    
}
