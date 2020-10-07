public class SwitchExample2 {

    public static void main(String[] args) {
        
        int number=20;
        switch(number){
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            case 30: System.out.println("30");
            default:System.out.println("Not in 10, 20 or 30");
        }
    }
}/*Code di atas di buat untuk mengetahui jika switch case tidak 
menggunakan break apa yang akan terjadi, yang akan terjadi yaitu 
semua akan di tampilkan jika sebuah kondisi case pertama terpenuhi 
dan jika dimulai dari case 2 yang kondisinya terpenuhi maka yang di 
tampilkan mulai dari case yang terpenuhi sampai akhir dari switch 
tersebut jadi case 1 yang tidak terpenuhi maka tidak akan di tampilkan   
*/