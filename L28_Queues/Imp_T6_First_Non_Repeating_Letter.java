package L28_Queues;

import java.util.*;

public class Imp_T6_First_Non_Repeating_Letter {

    public static int[] map = new int[26];

    public static void printFirstNonRepeatingLetters(String str) {
        StringBuilder sb = new StringBuilder("");

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            q.add(c);
            map[c-'a']++;

            // Print First Occurence Letter
            char firstOcc = q.peek();
            if (map[firstOcc - 'a'] <= 1) {
                sb.append(firstOcc + " ");
            }

            while (!q.isEmpty() && map[firstOcc - 'a'] > 1) {
                firstOcc = q.peek();
                q.remove();
            }
            
            if (q.isEmpty())
                sb.append(-1 + " ");
            else
                sb.append(firstOcc + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {

        String str = "aabccxb";
        printFirstNonRepeatingLetters(str);

    }

}
