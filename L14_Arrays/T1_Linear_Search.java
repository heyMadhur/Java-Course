package L14_Arrays;

public class T1_Linear_Search {

    public static int linearSearch(int [] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {

        int [] arr= {21,34,43546,57,68,678,87,4556,324,234,32,4};
        int idx= linearSearch(arr, 68);
        System.out.println(idx);
        
    }
}
