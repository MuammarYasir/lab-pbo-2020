import java.util.Scanner;

/**
 * Write a description of class AgenLimit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeLimit {
    
     public static void main(String args[]) {
         int age = 0;
         Scanner in = new Scanner(System.in);
         
         System.out.print("Enter age ");
         age = in.nextInt();
         
         //age=Math.max(age,0);
         age = Math.min(40, age);
         System.out.print("Age is "+age);
     }
}/*class ini di buat untuk mengetes math min*/
