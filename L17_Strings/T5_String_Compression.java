package L17_Strings;

public class T5_String_Compression {

    public static void stringCompression_Bruteforce(String str) {
        int [] arr= new int [26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        StringBuilder sb= new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                char c='a';
                c+=i;
                if(arr[i]==1) sb.append(c);
                else sb.append(c+""+arr[i]);
            }
        }
        System.out.println(sb);
    }
    
    public static void stringCompression(String str) {
        StringBuilder sb= new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1) sb.append(count);
        }

        System.out.println(sb);
        
    }
    
    public static void main(String[] args) {
        String str="aaabbcccdde";
        stringCompression_Bruteforce(str);
        stringCompression(str);
        
    }
    
}
