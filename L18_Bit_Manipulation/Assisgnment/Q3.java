package L18_Bit_Manipulation.Assisgnment;

public class Q3 {

    public static int Add1(int num){
        return -~num;
    }

    public static void main(String[] args) {
        // Q3 Add 1 to an integer using Bit Manipulation.
        // (Hint: try using Bitwise NOT Operator)

        System.out.println(Add1(23));
        
    }
    
}
