package L14_Arrays;

public class Imp_T7_maxSubArraySum_BruteForce {

    public static void maxSubArrSum_BruteForce(int [] arr) {
        int maxSum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum= 0;
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                }
                maxSum=Math.max(maxSum, sum);
            }
        }
        System.out.println("Max Sum= "+maxSum);
    }

    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        maxSubArrSum_BruteForce(arr);
    }
    
}
