import java.util.Scanner;

/**
 * Write a description of class Main here.
 * Class ini di buat untuk menjalankan seluruh program dari class lain dan inti dari program ini
 *
 * @author Muammar Yasir
 * @version 1.0 12/03/2020
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int menu;
        Bus bis = new Bus();
        String nama;
        String hamil;
        int pilihan, umur;
        boolean check;
        
        System.out.println("===== BUS TRANS KOETARADJA =====");
        
        while(true){
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~");
            System.out.println("MENU : ");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            System.out.println();
            input.nextLine();
        
            switch(menu)
            {
                case 1:
                    bis.jumlahPenumpang();
                    break;
                case 2:
                    bis.turunPenumpang();
                    break;
                case 3:
                    System.out.println(bis.toString());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                System.out.println("Pilih Sesuai Yang Ada Pada Menu");
            }
        }
    }
}
