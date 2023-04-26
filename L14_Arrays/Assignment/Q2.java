package L14_Arrays.Assignment;

public class Q2 {

    public static int binarySearch(int [] arr, int key){
      int start=0, end=arr.length-1;
      // Finding Strictly Increasing
      while(start<=end){
        int mid= (start+end)/2;
        if(key==arr[mid]) return mid;

        else if(arr[start]<arr[mid]){
          if(key>= arr[start] && key<=arr[mid])  
            end= mid-1;
          else
            start=mid+1;
        }

        else{
          if(key>=arr[mid] && key<=arr[end])
            start= mid+1;
          else
            end=mid-1;
        }
      }
      return -1;
    }


    public static void main(String[] args) {
      // Q2 There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
      // For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]

      int [] arr= {4,  5, 6, 7, 0, 1, 2};
      System.out.println(binarySearch(arr, 0));
      
      
      
    }
}
