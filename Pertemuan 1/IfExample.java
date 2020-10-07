import java.util.Scanner;

public class IfExample {

        public static void main(String[] args) {

            int age=0;
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Masukkan umur anda:");
            age = sc.nextInt();
            if(age>=17)
            System.out.print("Anda sudah boleh buat KTP");
    }
}/*Code di atas di buat untuk mencoba seleksi if yang dapat digunakan 
untuk menguji suatu kondisi jika kondisi terpenuhi maka akan dilanjutkan
jika kondisi tidak terpenuhi maka akan di uji pada pilihan lain */