
public class Try {

    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeRange(int n){
        System.out.print(2+ " ");
        for(int i=3; i<=n; i+=2){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    
    public static void binToDec(int num){
        int dec=0;
        int i=0;
        while(num>0){
            int lastDigit= num%10;
            dec+= lastDigit*Math.pow(2,i);
            i++;
            num/=10;
        }
        System.out.println(dec);        
    }

    public static void decToBin(int num){
        int bin=0;
        int pow=0;
        while(num>0){
            int rem= num%2;
            bin+= rem*Math.pow(10,pow);
            // System.out.println(bin);
            pow++;
            num/=2;
        }
        System.out.println(bin);

    }
    
    public static void reverseArr(int [] arr){
        int size= arr.length;
        for(int i=0; i<size/2; i++){
            // Swap arr[i] and arr[size-i-1]
            int temp= arr[i];
            arr[i]= arr[size-i-1];
            arr[size-i-1]= temp;
            
        }
    }

    public static void printArr(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printPair(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+','+arr[j]+") ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printSubArrays(int arr []){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){

                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }  
    }

    public static void maxSubArrays(int arr []){
        int min= Integer.MAX_VALUE, max= Integer.MIN_VALUE, sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                max= (sum>max)?sum:max;
                min= (sum<min)?sum:min;
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }

    public static void prefixSumArray(int arr[]){
        int prefixArr[]= new int [arr.length];
        prefixArr[0]=arr[0];
        int sum=0, max=Integer.MIN_VALUE; 

        for(int i=1; i<arr.length; i++){
            prefixArr[i]= prefixArr[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum= (i==0)?prefixArr[j]:prefixArr[j]-prefixArr[i-1];
                max=Math.max(max, sum);
            }
        }
        System.out.println("Max using Prefix Arr= "+max);
    }
    
    public static void kadanesSubArrays(int arr[]){
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            sum= (sum<0)?0:sum;
            max=(sum>max)?sum:max;
        }
        System.out.println("Max using Kadanes= "+max);
    }
    
    public static void trapRainWater(int [] arr){
        int trappedWater=0;
        int width=1;
        for(int i=0; i<arr.length; i++){
            int idx=i, leftMax= arr[i], rightMax= arr[i];
            while(idx>=0){
                leftMax=Math.max(leftMax, arr[idx]);
                idx--;
            }
            idx=i;
            while(idx<arr.length){
                rightMax=Math.max(arr[idx], rightMax);
                idx++;
            }
            
            int waterlevel= Math.min(leftMax,rightMax);
            if(waterlevel-arr[i]>=0){
                trappedWater+=(waterlevel-arr[i])*width;
            }
        }
        System.out.println("TrappedWater= "+trappedWater);
    }
    
    public static void trapRainWaterOptimized(int [] arr){
        int trappedWater=0, size= arr.length, width=1;
        int [] leftAuxArr= new int[size];
        int [] rightAuxArr= new int[size];
        
        // For left Auxilary Array
        leftAuxArr[0]=arr[0];
        for(int i=1; i<size; i++){
            leftAuxArr[i]=Math.max(leftAuxArr[i-1], arr[i]);
        }
        
        // For Right Auxilary Array
        rightAuxArr[size-1]=arr[size-1];
        for(int i=size-2; i>=0; i--){
            rightAuxArr[i]=Math.max(arr[i], rightAuxArr[i+1]);
        }
        
        for(int i=0; i<size; i++){
            int waterLevel= Math.min(leftAuxArr[i], rightAuxArr[i]);
            if(waterLevel-arr[i]>=0){
                trappedWater+=(waterLevel-arr[i])*width;
            }
        }
        System.out.println("TrappedWater= "+trappedWater);
    }

    public static void stockRemendation(int arr[]){
        int size= arr.length;
        int buyPrice= Integer.MAX_VALUE;
        int profit= 0;
        for(int i=0; i<size; i++){
             buyPrice= Math.min(arr[i],buyPrice);
            //  System.out.println(arr[i]+" "+buyPrice);
             profit=Math.max(profit,(arr[i]-buyPrice));
        }
        System.out.println("Max Profit= "+profit);
    }
    
    public static int binarySearch(int [] arr, int key) {
        int start=0, end=arr.length-1;
        
        while(start<=end){
            int mid= (start+end)/2;

            if(key==arr[mid]) return mid;
            else if(arr[start]<arr[mid]){
                if(key>=arr[start] && key<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
    
    public static void printSpiral(int [] [] arr){
        int i=0,j=0;
        int left=0, right=arr[0].length-1, top=0, bottom=arr.length-1;
        // System.out.println(right+" "+bottom);

        while(left<=right || top<=bottom){
            while(j<right){
                System.out.print(arr[i][j++]+" ");
            }
            top++;
            while(i<bottom){
                System.out.print(arr[i++][j]+" ");
            }
            right--;
            while(j>left){
                System.out.print(arr[i][j--]+" ");
            }
            bottom--;
            while(i>top){
                System.out.print(arr[i--][j]+" ");
            }
            left++;
        }
        // System.out.print(arr[i][j]);
        
        
    }

    public static void fillMatrix(int [] [] matrix){
        int counter=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=counter++;
            }
        }
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }

    public static void fastExponential(int num, int pow){
        int ans=1;
        while(pow>0){
            int currBit= 1 & pow;
            if(currBit==1) ans*=num;
            num*=num;
            pow= pow>>1;
        }
        System.out.println(ans);
        
    }
    
    public static void setBit(int num) {
        int count=0;
        while(num>0){
            if((1 & num)==1) count++;
            num=num>>1;
        }
        System.out.println(count);

    }
    
    public static void main(String[] args) {
        
        // printPrimeRange(100);
        // binToDec(1000);
        // decToBin(8);

        // int arr[]= {7,1,5,3,6,4};
        // int arr[]= {5,4,1,3,2,6};

        // System.out.println("Before Reverse-: ");
        // printArr(arr);
        // System.out.println("After Reverse");
        // reverseArr(arr);
        // printArr(arr);

        // printPair(arr);
        // printSubArrays(arr);
        // maxSubArrays(arr);
        // prefixSumArray(arr);
        // kadanesSubArrays(arr);

        // trapRainWater(arr);
        // trapRainWaterOptimized(arr);

        // stockRemendation(arr);

        // int [] [] matrix= new int [4] [4];
        // fillMatrix(matrix);
        // printSpiral(matrix);

        fastExponential(10, 5);
        setBit(15);

        A b= new B();
        System.out.println(b.i);
        b.print();

    }
    

}

class A{
    int i=10;
    void print(){
        System.out.println("HVK!!!!!");
    }
}
class B extends A{
    int i=20;
    @Override
    void print(){
        System.out.println("HVK!!!!!");
    }
}

