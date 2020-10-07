public class Smallest{

    public static void main(String arg[]){

        int a, b;
        Mulai:
        for(a=0; a<2; a++){
            for(b=0; b<3; b++){
                if(b==2)
                    break Mulai;
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }
} /*Code di atas di buat untuk mencoba pemakaian label pada break 
 yang dapat digunakan untuk menghentikan operasi pada statemen yang 
 bermakna jika kondisi pada if menjadi true maka break akan menghentikan
 loop pertama */
