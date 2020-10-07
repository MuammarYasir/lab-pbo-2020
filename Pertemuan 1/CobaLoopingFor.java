public class CobaLoopingFor{

    public static void main(String arg[]){
        
        for (int i=0; i<10; i++){
            for (int j=0; j<i+1; j++)
                System.out.print('*');

            System.out.println();
        }
    }
} /* Code di atas di buat untuk mencoba looping for yang sudah 
diketahui nilai pasti nya dan akan mengulangi hingga batas nilai yang
diketahui */