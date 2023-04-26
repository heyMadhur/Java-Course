package L19_OOPS.Assignment;

public class Q3 {
    public static void main(String[] args) {

        // Q3 Look at the following code and choose the right option for the word:
        // Ans- Both protected and public can be used
        
        // You can provide only a less restrictive or same-access modifier when overriding a method.

        
    }
    
}
// Shape.java
class Shape{
    protected void display() {
        System.out.println("Display-base");
    }
}
// Circle.java
// public class Circle extends Shape{ 
//     // Choose the correct access modifier
//     <access-modifier> void display() {
//         System.out.println("Display-derived");
//     }
// }
