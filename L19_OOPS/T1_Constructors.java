package L19_OOPS;

public class T1_Constructors {

    public static void main(String[] args) {
        
        Employee e1= new Employee("Rohit", 15);
        e1.id="hvk69";
        e1.password="hello!!!";
        e1.marks[0]=80; e1.marks[1]=90; e1.marks[2]=100;
        
        Employee e2= new Employee(e1);
        // System.out.println(e2.name);
        // System.out.println(e2.age);
        // System.out.println(e2.id);
        // System.out.println(e2.password);

        e1.marks[0]=100;
        System.out.println(e2.marks[0]);
        
        
    }
    
}

class Employee{
    String name, id, password;
    int age;
    int [] marks;

    // Non- Parameterized Constructor
    Employee(){
        System.out.println("Non-Paramterized Constructor");
    }

    // Parameterized Constructor
    Employee(String name, int age){
        marks= new int[3];
        this.name= name;
        this.age=  age;
    }

    // Copy Constructor- Shallow
    // Employee (Employee e1){
    //     marks= new int[3];
    //     this.name= e1.name;
    //     this.id= e1.id;
    //     this.password= e1.password;
    //     this.age= e1.age;
    //     this.marks= e1.marks;
    // }
    
    // Copy Constructor- Deep Copy
    Employee (Employee e1){
        marks= new int[3];
        this.name= e1.name;
        this.id= e1.id;
        this.password= e1.password;
        this.age= e1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]= e1.marks[i];
        }
    } 
}


