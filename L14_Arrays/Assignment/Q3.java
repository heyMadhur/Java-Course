package L14_Arrays.Assignment;

public class Q3 {

    public static void stockRemendation(int [] arr){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<arr.length; i++){
            if(buyPrice>arr[i]) buyPrice=arr[i];
            else{
                int profit= arr[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }
        }
        System.out.println("Max Profit= "+maxProfit);
        
    }

    public static void main(String[] args) {
        // Q3 You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

        int [] price={7,1,5,3,6,4};
        stockRemendation(price); 
        
        
    }
    
}
