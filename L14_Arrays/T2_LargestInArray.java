package L14_Arrays;

public class T2_LargestInArray {

    public static void findLargest(int [] arr) {
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        System.out.println("Largest Num= "+max+" at index= "+idx);
    }
    
    public static void main(String[] args) {

        int arr[]= {34,24,56,57,658,678,56754,6754,7};
        findLargest(arr);
        
    }
}
