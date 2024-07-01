// Author: Mr. Yoni Reznik
// Using java –ea from the terminal on count_demo will allow the assert
// statements to be used.

/* Note to students reading this file: The code is commented along the way
 * which will help when answering questions at the bottom of this file. You
 * may scroll all the way to the bottom to view those questions first that 
 * we will be answering with this demonstration.
 */

 //Java uses a class to layout object, it is an object oriented prog. language
 public class count_demo{

    //The following lines define the entry point of the program, aka "main"
    public static void main(String[] args) {

        //The system library can be used to print to console using println
        System.out.println("Welcome to this demonstration.");

        /*Java is statically typed, unlike Python which is dynamically typed.
        Values must be assigned a type explicitly such as 8-bit (byte), 16-bit
        (short), 32-bit (int) or 64-bit (long).*/
        
        byte    a = 0;  //an 8-bit integer
        short   b = 0;  //a 16-bit integer
        int     c = 0;  //a 32-bit integer, standard
        long    d = 0;  //a 64-bit integer

        //The increment operator x++ tells java to increment each integer by 1
        a++; b++; c++; d++;  //multiple statements allowed in one line of code

        //Next use println again to show the values of all four variables
        //The + in this case is a concatenation operator used for joining terms
        System.out.println(a+" "+b+" "+c+" "+d);

        //Assert statements can check values before proceeding
        assert a==1;
        assert b==1; 
        assert c==1;
        assert d==1;

        //Let's print a little user message
        System.out.println("Incremented: success");

        //The ++x operator means the value is PRE-incremented before printed
        System.out.println(++a+" "+ ++b+" "+ ++c+" "+ ++d); //alotta + signs :)

        /*Now to increment each primitive data type (8/16/32/64-bit) using a
        loop that will continuously increment values until they reach maximum.
        
        It is a good time to explain how these data types work to store integers.
        The range of values for each data type are such that half are negative
        and the other half are made of 0 and positive.
        
        The concept is implemented using a counting system known as two's 
        complement and is beyond the scope of this exercise.*/

        //Time to use a while loop for Byte a
        while(a>0){
            ++a;
        }
        System.out.println(a);
        System.out.println("The max positive value of byte is: "+ --a);
        System.out.println("The min negative value of byte is: "+ ++a);

        while(b>0){
            ++b;
        }
        System.out.println(b);
        System.out.println("The max positive value of short is: "+ --b);
        System.out.println("The min negative value of short is: "+ ++b);

        while(c>0){
            ++c;
        }
        System.out.println(c);
        System.out.println("The max positive value of int is: "+ --c);
        System.out.println("The min negative value of int is: "+ ++c);

        while(true){
            ++d;
            if(d==9223372036854775807L)
                break;
        }
        System.out.println(d);
        System.out.println("The max positive value of long is: "+ d);
        System.out.println("The min negative value of long is: "+ ++d);

        //Looks like its time for some more assertions
        assert a==Byte.MIN_VALUE;
        assert --a==Byte.MAX_VALUE;
        assert b==Short.MIN_VALUE;
        assert --b==Short.MAX_VALUE;
        assert c==Integer.MIN_VALUE;
        assert --c==Integer.MAX_VALUE;
        assert d==Long.MIN_VALUE;
        assert --d==Long.MAX_VALUE;

        //Time for some more output message
        System.out.println("Byte Max/Min: success");
        System.out.println("Short Max/Min: success");
        System.out.println("Integer Max/Min: success");
        System.out.println("Long Max/Min: success");
        
        

        //long start = System.currentTimeMillis();
        //long finish = System.currentTimeMillis();
        //long timeElapsed = finish - start;
        //System.out.println("Time elapsed for d was "+timeElapsed); 


        //Answer the following questions:
        //1. What is 2^8 power?
        //2. What is the relationship between this number and byte's max/min?
        //3. What is 2^16 power?
        //4. What is the relationship between this number and short's max/min?
        //5. What is 2^32 power?
        //6. What is the relationship between this number and int's max/min?
        //7. What is 2^64 power?
        //8. What is the relationship between this number and long's max/min?
        //9. What is the System.out.println() used for?
        //10. What is the x++ or ++x operator used for?
        //11. What is the ; used for in java?
        //12. Count how many assert statements were used in this program.
        //13. Are types interchangeable in Java?
        //14. What is the entry point for the program?
        
        //Addition Notes
        /* Java is a compiled language, which means unlike Python it does not
         * interpret line by line, but instead compiles everything to objects,
         * in virtual memory on the java virtual machine.  
         * 
         * Learning Java is a great way to test yourself in using strict syntax
         * of a statically typed language.  Best of luck to you all!
         * 
         */



    }
}