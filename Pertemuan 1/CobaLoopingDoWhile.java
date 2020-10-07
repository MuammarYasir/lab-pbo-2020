public class CobaLoopingDoWhile{

    public static void main (String[] args){
        int a = 0;

        do{
            int b = 0;
            while (b<a+1){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }while (a < 10);
    }
}/* Code di atas di buat untuk mencoba looping do while dapat di gunakan
saat perulangan dengan jumlah yang belum diketahui pasti dan proses yang 
dilakukan pada do while ini yaitu pada do akan dikerjakan terlebih 
dahulu setelah itu akan di cek kondisi pada while jika terpenuhi maka 
akan di tampilkan */