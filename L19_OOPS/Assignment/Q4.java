package L19_OOPS.Assignment;

public class Q4 {

    public static void main(String[] args) {

        // Q4 What is the output of the following program?

        // BlueCar b=new BlueCar();

        // Output= 13245
        
    }
}

abstract class Car{
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

class BlueCar extends Car{
    {
        System.out.print("4");
    }

    public BlueCar() {
        super("blue");
        System.out.print("5");
    }
}

