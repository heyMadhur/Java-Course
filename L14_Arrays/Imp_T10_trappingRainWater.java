package L14_Arrays;

public class Imp_T10_trappingRainWater {

    public static void trapRainWater(int arr[], int width){
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

            water+=(waterLevel-arr[i])* width;
        }
        System.out.println("Water Trapped= "+water);
        
    }

    public static void main(String[] args) {

        int height []= {4,2,0,6,3,2,5};
        trapRainWater(height, 1);
    }
    
}
