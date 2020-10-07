public class CobaLoopingWhile{

    public static void main(String arg[]){
        int i=0;

        while (i<10){
            int j=0;
            while (j<i+1){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
} /*Code di atas dibuat untuk mencoba looping while, looping while ini
fungsi nya yaitu melakukan perulangan seperti looping for yang berbeda
hanya penulisan code akan tetapi jumlah jumlah perulangan yang belum 
di ketahui pasti karena diperlukan pengecekan pada kondisi while dan 
jika kondisi while true maka akan di tampilkan pernyataan yang ada di 
dalamnya */