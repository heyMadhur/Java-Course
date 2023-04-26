package L20_Recursion_Basics;

public class T5_First_and_Last_Occurence {
    public static int first=-1, last=-1;

    public static void firstLastOccurence(int [] arr, int idx, int key) {
        // Base Condition
        if(idx==arr.length){
            System.out.println("First Occurence= "+first);
            System.out.println("Last Occurence= "+last);
            return;
        }

        if(arr[idx]==key){
            if(first==-1){ 
                first= idx;
            }
            last= idx;
        }

        firstLastOccurence(arr, idx+1, key);
    }

    public static void main(String[] args) {
        int [] arr= {122,4,46,5687,678,34,123,122};
        firstLastOccurence(arr, 0, 122);
    }
    
}
