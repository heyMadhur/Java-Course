package L29_Greedy_Algorithms.Assignment;

public class Q2 {

    public static void KthLargestOddNum(int l, int r, int k) {
        if (k > (r - l + 1) / 2) {
            System.out.println("Ans= " + 0);
            return;
        }

        if (r % 2 == 0)
            r = r - 1;

        for (int i = 0; i < k - 1; i++) {
            r -= 2;
        }
        System.out.println("Kth Max Odd No= " + r);
    }

    public static int kthOdd(int L, int R, int K) {
        if (K <= 0)
            return 0;
        if ((R & 1) > 0) {          // Checking if Odd
            int Count = (int) Math.ceil((R - L + 1) / 2);
            if (K > Count)
                return 0;
            else return(R - 2 * K + 2);
        } else {                    // Ri is Even
            int Count = (R - L + 1) / 2;
            if (K > Count)
                return 0;
            else return(R - 2 * K + 1);
        }
    }

    public static void main(String[] args) {

        // Q2 Kth largest odd number in a given range
        // We have two variables L and R, indicating a range of integers from L to R
        // inclusive, and a number K, the task is to find Kth largest odd number. If
        // K>number of odd numbers in the range L to R, then return 0.

        int L = -3, R = 3, K = 1;
        KthLargestOddNum(L, R, K); // Output=3
        
        KthLargestOddNum(1, 10, 2); // Output=9
        KthLargestOddNum(15, 25, 4); // Output=19
        KthLargestOddNum(30, 40, 5); // Output=31
        KthLargestOddNum(5, 7, 1); // Output=7
        KthLargestOddNum(0, 2, 2); // Output=0

        System.out.println("Using Method-2");

        System.out.println(kthOdd(1, 10, 2)); // Output=9
        System.out.println(kthOdd(15, 25, 4)); // Output=19
        System.out.println(kthOdd(30, 40, 5)); // Output=31
        System.out.println(kthOdd(5, 7, 1)); // Output=7
        System.out.println(kthOdd(0, 2, 2)); // Output=0
        
    }

}
