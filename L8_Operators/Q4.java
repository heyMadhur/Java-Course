package L8_Operators;

public class Q4 {
    public static void main(String[] args) {
        // Q4 What will be the output of the following program

        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

        // First solve All Brackets
        // Then, Solve all multiplication and division
        // Then, Solve all addition
        // Ans will be 278
        
        System.out.println(exp);

        
        
        
    }
}
