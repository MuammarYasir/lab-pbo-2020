public class CobaContinue{

    public static void main(String arg[]){

        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++){
                if(j==5)
                    continue;
                System.out.print('*');
            }
            System.out.println();
        }
    }
}/*Code di atas di buat untuk mencoba statemen continue yang dapat 
melewatkan sisa pernyataan dalam loop dan dilanjutkan dengan proses 
selanjutnya dari loop setelah continue di eksekusi */