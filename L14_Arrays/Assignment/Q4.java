package L14_Arrays.Assignment;

public class Q4 {

    public static void trapRainWater(int arr[], int height){
        int size= arr.length;
        int [] leftMaxArr= new int [size];
        leftMaxArr[0]= arr[0];
        for(int i=1; i<size; i++){
            leftMaxArr[i]=Math.max(leftMaxArr[i-1], arr[i]);
        }

        int [] rightMaxArr= new int [size];
        rightMaxArr[size-1]= arr[size-1];
        for(int i= size-2; i>=0; i--){
            rightMaxArr[i]=Math.max(rightMaxArr[i+1], arr[i]);
        }

        int water=0;
        for (int i = 0; i < size; i++) {
            int waterLevel= Math.min(leftMaxArr[i], rightMaxArr[i]);

            water+=(waterLevel-arr[i])* height;
        }
        System.out.println("Water Trapped= "+water);
        
    }


    public static void main(String[] args) {
        // Q4 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
        
        int arr[]= {4,2,0,3,2,5};
        trapRainWater(arr, 1);
            
    }
    
}
