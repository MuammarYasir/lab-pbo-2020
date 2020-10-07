public class CobaBreak{

    public static void main(String arg[]){

        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                if(j==5)
                    break;
                System.out.print('*');
            }
            System.out.println();
        }
    }
} /*Code di atas di buat untuk mencoba statemen break yang dapat 
menyebabkan suatu kondisi untuk keluar dari perulangan sebagai contoh
break akan mengeluarkan perulangan di tempat statemen break berada dan 
juga break pada code di atas berada proses loop ke-2 maka dari itu 
akan memghentikan proses loop ke-2 */