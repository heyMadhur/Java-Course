package L20_Recursion_Basics;

public class Imp_T9_Friends_Pairing {
    
    public static int friendsPairing(int n){
        // Base Condition
        if(n==1) return 1;
        if(n==2) return 2;
        
        // Choose to be Single
        int choice1= friendsPairing(n-1);

        // Choose to be in pair
        int choice2= (n-1) * friendsPairing(n-2);

        return choice1+choice2;
        
    }


    public static void main(String[] args) {

        // Friends Pairing Problem
        // Given n friends, each one can remain single or can be paired up with some other griend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.....

        System.out.println(friendsPairing(3));
        
        
    }
}
