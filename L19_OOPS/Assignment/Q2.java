package L19_OOPS.Assignment;

public class Q2 {
    public static void main(String[] args) {
        // Q2 What is the output of the following program?
        
        final Car car= new ElectricCar();
        System.out.print(car.drive());
        // Output- Driving electric car
        // Note that car can only access the functions of electric car which are present in car also.......
        
        
    }
}

class Automobile{
    // private String drive() {
    //     return "Driving vehicle";
    // }
}
class Car extends Automobile{
    protected String drive() {
        return "Driving car";
    }
}
class ElectricCar extends Car{
    @Override
    public final String drive() {
        return "Driving electric car";
    }
}
