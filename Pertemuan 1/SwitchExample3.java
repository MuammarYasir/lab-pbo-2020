public class SwitchExample3 {

    public static void main(String[] args) {
        
        String dayOfWeekArg = "Thursday";
        String typeOfDay = "";
        
        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
            System.out.println("Invalid day of the week: " + dayOfWeekArg);
        }
        System.out.println(typeOfDay);
    }
}/* Code di atas di buat untuk mencoba switch-case pada string
Pada awal string yang telah di tentukan dan kemudian di cek kondisi 
pada case case yang sudah di buat jika sebuah string yang sudah 
mendapatkan kondisi pada case tersebut maka akan ditampilkan pernytaan
yang ada dalam case tersebut  */