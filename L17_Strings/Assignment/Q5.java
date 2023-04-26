package L17_Strings.Assignment;

public class Q5 {
    public static void main(String[] args) {
        // Q5 Search and read about-:
        // a) intern( ) method in String
        // b) String Buffer

        // 1. Intern Method in String
        // Reference Link- https://www.javatpoint.com/java-string-intern
        // It can be used to return string from memory if it is created by a new keyword. It creates an exact copy of the heap string object in the String Constant Pool.

        System.out.println("1. Intern Method\n");

        String str = new String("Haa Vai Kiski");   
        String str1 = new String("Haa Vai Kiski");  
        System.out.println("Before using intern method= "+ (str1 == str)); // prints false
        // The println statement prints false because separate memory is allocated for each string literal. Thus, two new string objects are created in the memory i.e. str and str1. that holds different references.
        // We know that creating an object is a costly operation in Java. Therefore, to save time, Java developers came up with the concept of String Constant Pool (SCP). The SCP is an area inside the heap memory. It contains the unique strings. In order to put the strings in the string pool, one needs to call the intern() method. Before creating an object in the string pool, the JVM checks whether the string is already present in the pool or not. If the string is present, its reference is returned.

        String str2 = new String("HVK").intern(); // statement - 1  
        String str3 = new String("HVK").intern(); // statement - 2  
        System.out.println("After using intern method= "+ (str2 == str3)); // prints true
        // In the above code snippet, the intern() method is invoked on the String objects. Therefore, the memory is allocated in the SCP. For the second statement, no new string object is created as the content of str and str1 are the same. Therefore, the reference of the object created in the first statement is returned for str1. Thus, str and str1 both point to the same memory. Hence, the print statement prints true.

        String s1 = "Hey";  
        String s2 = s1.intern();  
        String s3 = new String("Hey");  
        String s4 = s3.intern();          
        System.out.println("For New Example");
        System.out.println(s1==s2); // True  
        System.out.println(s1==s3); // False  
        System.out.println(s1==s4); // True       
        System.out.println(s2==s3); // False  
        System.out.println(s2==s4); // True        
        System.out.println(s3==s4); // False  
        
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // 2. String Buffer
        // Reference Link- https://www.javatpoint.com/StringBuffer-class
        // Java StringBuffer class is used to create mutable String objects. The StringBuffer class in Java is the same as String class except it is mutable.
        // Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.

        System.out.println("\n\n2. String Buffer\n");
        StringBuffer sb= new StringBuffer("Hello");

        // Important Method in String Buffer

        // 1) StringBuffer Class append() Method
        // The append() method concatenates the given argument with this String.
        sb.append(" Brother!!!");
        System.out.println(sb);
        
        // 2) StringBuffer insert() Method
        // The insert() method inserts the given String with this string at the given position.
        sb.insert(5, " Ladies &");
        System.out.println(sb);
        
        // 3) StringBuffer replace() Method
        // The replace() method replaces the given String from the specified beginIndex and endIndex.
        sb.replace(0, 5, "Good Bye");
        System.out.println(sb);
        
        // 4) StringBuffer delete() Method
        // The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.
        sb.delete(9, 18);
        System.out.println(sb);
        
        // 5) StringBuffer reverse() Method
        // The reverse() method of the StringBuilder class reverses the current String.
        sb.reverse();
        System.out.println(sb);

        // 6) StringBuffer capacity() Method
        // The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
        StringBuffer sb1=new StringBuffer();  
        System.out.println(sb1.capacity());//default 16  
        sb1.append("Hello");  
        System.out.println(sb1.capacity());//now 16  
        sb1.append("java is my favourite language");  
        System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
        
        
        


    }
    
}
