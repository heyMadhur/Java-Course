package L8_Operators;

public class Q2 {
    public static void main(String[] args) {
        // Q2 What will be the output of the following program
        
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");             // Execute
        }
        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }

    }
}
