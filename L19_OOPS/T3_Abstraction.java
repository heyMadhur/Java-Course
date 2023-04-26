package L19_OOPS;

public class T3_Abstraction {
    public static void main(String[] args) {
    
        // Abstraction can be implemented in java by-:
        // 1. Abstract Classes
        // 2. Interfaces
        
        
    }
}

// Abstract Classes
abstract class Jaanvar{
    abstract public void walk();
}
class Ghoda extends Jaanvar{
    public void walk(){         // Must implement abstract method of parent class
        System.out.println("Ghoda is Walking");
    }
}

// Interfaces
interface Herbivore{
    void eat();
}
interface Carnivore{
    void walk();
}
class A implements Herbivore, Carnivore{        // Multiple Inheritance
    public void eat(){
        System.out.println("Eating");
    }
    public void walk(){
        System.out.println("Walking");
    }
}

