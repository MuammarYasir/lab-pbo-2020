
/**
 * Write a description of class Testtrycatch2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Testtrycatch2{
     public static void main(String args[]){
         try{
             int data=10/0;
         }catch(ArithmeticException e){System.out.println(e);}
        
         System.out.println("Rest of The Code...");
     }
} /*code ini di buat untuk mencoba try catch exception*/
