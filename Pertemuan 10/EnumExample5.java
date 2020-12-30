
/**
 * Write a description of class EnumExample5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class EnumExample5{
     enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
     
     public static void main(String args[]){
         Day day=Day.MONDAY;
         
         switch(day){
         case SUNDAY: System.out.println("sunday");
            break;
         case MONDAY: System.out.println("monday");
            break;
         default:
            System.out.println("other day");
         }
     }
} /*code ini di buat untuk mencoba enum dan menggunakan swith case*/
