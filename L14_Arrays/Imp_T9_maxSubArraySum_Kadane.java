package L14_Arrays;

public class Imp_T9_maxSubArraySum_Kadane {

    public static int maxSubArraySum_Kadane(int [] arr){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        boolean allNeg= true;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>0) allNeg=false;

            currSum+=arr[i];
            currSum=(currSum<0)?0:currSum;
            maxSum=Math.max(maxSum, currSum);
        }

        if(allNeg){
            maxSum= Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {  
                maxSum=Math.max(maxSum, arr[i]);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        // int arr[]= {1,-2,6,-1,3};
        int arr[]= {-1,2,-6,-4,0};
        System.out.println("Max Sum= "+maxSubArraySum_Kadane(arr));
           
    }
    
}
