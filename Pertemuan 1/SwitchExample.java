public class SwitchExample {

    public static void main(String[] args) {
        
        int number=20;
        switch(number){
            case 10: System.out.println("10");break;
            case 20: System.out.println("20");break;
            case 30: System.out.println("30");break;
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
} 
/* Code di atas di buat untuk mencoba seleksi switch-case yang fungsi 
nya sama dengan seleksi if-else if- else hanya berbeda dari penulisan
code nya yaitu mengecek kondisi di setiap case nya jika true maka 
pernyataan akan di lakukan dan jika semua case false maka dikembalikan
kepada default  */