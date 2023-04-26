package L23_Backtracking;

public class Imp_T3_Find_Permutations {

    public static void printPermutation(String str, String newStr) {
        if (str.length() == 0) {
            System.out.println(newStr);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            String temp = str.substring(0, i) + str.substring(i+1);

            // Chooses
            printPermutation(temp, newStr + c);
        }

    }

    public static void main(String[] args) {

        printPermutation("abc", "");

    }
}
