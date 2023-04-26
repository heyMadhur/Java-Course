package L14_Arrays;

public class Imp_T11_StockRecommendation {

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
        int [] price={7,1,5,3,6,4};
        stockRemendation(price); 
    }
}
