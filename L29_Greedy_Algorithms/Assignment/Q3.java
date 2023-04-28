package L29_Greedy_Algorithms.Assignment;

public class Q3 {

    public static void smallestString(int N, int K) {

        StringBuilder sb = new StringBuilder("a".repeat(N));
        K -= sb.length();

        int idx = sb.length() - 1;
        while (K > 0) {
            if (K >= 26) {
                sb.setCharAt(idx, 'z');
                K -= 25;
                idx--;
            } else {
                sb.setCharAt(idx, (char) (K + 'a'));
                K = 0;
            }
        }

        // for (int i = sb.length() - 1; i >= 0; i--) {
        //     if (K >= 26) {
        //         sb.setCharAt(i, 'z');
        //         K -= 25;
        //     } else {
        //         sb.setCharAt(i, (char) (K + 'a'));
        //         K = 0;
        //         break;
        //     }
        // }

        System.out.println(sb);

    }

    public static void main(String[] args) {
        // Q3 Lexicographically smallest string of length N and sum K
        // We have two integers N and K. The task is to print the lexicographically
        // smallest string of length N consisting of lower-case English alphabets such
        // that the sum of the characters of the string equals to K where ‘a’ = 1, ‘b’ =
        // 2, ‘c’ = 3, ..... and ‘z’ = 26.

        // Input-1
        smallestString(5, 42);
        smallestString(3, 25);

    }

}
