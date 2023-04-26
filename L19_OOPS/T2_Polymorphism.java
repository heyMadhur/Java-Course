package L19_OOPS;

public class T2_Polymorphism {
    public static void main(String[] args) {
        
        // Polymorphism is of 2 types-:
        // 1. Compile Time- Method OverLoading
        // 2. Run Time- Method Overriding


        
        
    }
}
// Method Overloading
class Calculator{
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public float sum(float a, float b){
        return a+b;
    }
}


// Method Overridind
class Animal{
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Horse extends Animal{
    @Override
    public void walk(){
        System.out.println("Horse is walking");
    }
}

