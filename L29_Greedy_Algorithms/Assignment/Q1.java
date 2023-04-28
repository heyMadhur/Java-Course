package L29_Greedy_Algorithms.Assignment;

public class Q1 {

    public static void maxBalancedStringPartitions(String str) {
        int L_count = 0, R_count = 0;

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R')
                R_count++;
            else
                L_count++;

            if (L_count == R_count) {
                count++;
                // L_count = R_count = 0;
            }
        }

        System.out.println("Maximum Partitions= " + count);
    }

    public static void main(String[] args) {

        // Q1 Maximum Balanced String Partitions
        // We have balanced string str of size N with an equal number of L and R, the
        // task is to find a maximum number X, such that a given string can be
        // partitioned into X balanced substring. A string is called to be balanced if
        // the number of ‘L’s in the string equals the number of ‘R’s.

        String str = "LRRRRLLRLLRL";                //Output= 3
        maxBalancedStringPartitions(str);

        String str1 = "LRLLRL";                     //Output= 1
        maxBalancedStringPartitions(str1);

        String str2 = "LRLRL";                      //Output= 2
        maxBalancedStringPartitions(str2);

        String str3 = "LRRLLRRL";                   //Output= 4
        maxBalancedStringPartitions(str3);

        String str4 = "LRLR";                       //Output= 2
        maxBalancedStringPartitions(str4);

        String str5 = "LLLLRRRR";                       //Output= 1
        maxBalancedStringPartitions(str5);

    }

}
