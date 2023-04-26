package L14_Arrays;

public class Imp_T8_maxSubArraySum_PrefixSum {

    public static void maxSubArrSum_PrefixSumArray(int arr[]) {
        int prefixSumArr[]= new int[arr.length];
        int maxSum=Integer.MIN_VALUE;

        // Prefix Sum Array
        prefixSumArr[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSumArr[i]=prefixSumArr[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int currSum= (i==0)?arr[j]:arr[j]-arr[i-1];
                maxSum= Math.max(maxSum, currSum);
            }
        }
        System.out.println("Max Sum= "+maxSum);
    }

    public static void main(String[] args) {
        
        int arr[]= {1,-2,6,-1,3};
        maxSubArrSum_PrefixSumArray(arr);
    }
    
}
