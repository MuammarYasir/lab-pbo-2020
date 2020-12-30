
/**
 * Write a description of class TestMultipleCatchBlock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMultipleCatchBlock{
     public static void main(String args[]){
         try{ 
             int a[]=new int[5];
             a[5]=30/0;
         }
         catch(ArithmeticException e){
             System.out.println("task1 is completed");
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("task 2 completed");
         }
         catch(Exception e){
             System.out.println("common task completed");
         }
        
         System.out.println("rest of the code...");
     }
} /*code ini di buat untuk mencoba try catch dengan banyak blok*/
