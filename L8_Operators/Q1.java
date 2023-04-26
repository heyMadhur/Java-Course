package L8_Operators;

public class Q1 {
    public static void main(String[] args){

        // Q1 What will be the output of the following program?

        int x = 2, y = 5;
        int exp1 = (x * y / x);             // 5
        int exp2 = (x * (y / x));           // 4

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
