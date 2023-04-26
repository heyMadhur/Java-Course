package L8_Operators;

public class Q3 {
    public static void main(String[] args) {
        // Q3 What will be the output of the following program

        int x, y, z;

        x = y = z = 2;
        x += y;             // x= 4
        y -= z;             // y= 0
        z /= (x + y);       // z= 0

        System.out.println(x + " " + y + " " + z);
        
        
        
    }
}
