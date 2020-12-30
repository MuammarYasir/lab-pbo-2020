import java.util.Random;

/**
 * Write a description of class RandomRange here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomRange {
     public static void main(String[] args) {
         Random num = new Random();
         
         int randomnum = num.nextInt(10)+4;
         System.out.println("Random Number: " + randomnum);
     }
}/*class ini di buat untuk mengetes math random pada angka*/
