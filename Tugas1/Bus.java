import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Bus here.
 * Class ini di buat untuk menyimpan array dari penumpang dan juga merupakan class yang di gunakan pada class main
 *
 * @author Muammar Yasir
 * @version 1.0 12/03/2020
 */
public class Bus
{
    ArrayList<Penumpang> penumpangBiasa = new ArrayList<Penumpang>();
    ArrayList<Penumpang> penumpangPrioritas = new ArrayList<Penumpang>();
    String nama, hamil;
    int pilihan, umur;
    int n = 0;
    boolean check;
    Scanner in = new Scanner(System.in);
    
    public Bus()
    {
        ArrayList penumpangBiasa;
        ArrayList penumpangPrioritas;
    }

    public ArrayList<Penumpang> getPenumpangBiasa()
    {
        return penumpangBiasa;
    }
    
    public ArrayList<Penumpang> getPenumpangPrioritas()
    {
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa()
    {
        return penumpangBiasa.size();
    }
    
    public int getJumlahPenumpangPrioritas()
    {
        return penumpangPrioritas.size();
    }
    
    public void jumlahPenumpang()
    {
        System.out.print("Nama\t: ");
        nama = in.nextLine();
        System.out.print("Umur\t: ");
        umur = in.nextInt();
        in.nextLine();
        System.out.print("Hamil(y/n) : ");
        hamil = in.nextLine();
        if(hamil.equalsIgnoreCase("y")){
           check = true;
        }else{
           check = false;
        }
        Penumpang penumpang = new Penumpang(nama, umur, check);
        NaikPenumpang(penumpang);
    }
    
    public boolean NaikPenumpang(Penumpang penumpang)
    {
        if(penumpang.getUmur() <= 10 || penumpang.getUmur() >= 60 || penumpang.getHamil())
        {
            if(penumpangPrioritas.size() <= 2)
            {
                System.out.println("Penumpang " + penumpang.getNama() + " Telah Duduk Pada Kursi Prioritas");
                penumpangPrioritas.add(penumpang);
                return true;
            }
            else if(penumpangPrioritas.size() == 2 && penumpangBiasa.size() <= 4)
            {
                System.out.println("Penumpang " + penumpang.getNama() + " Telah Duduk");   
                penumpangBiasa.add(penumpang);
                return true;
            }
        }else if(penumpangBiasa.size() <= 4)
        {
            System.out.println("Penumpang " + penumpang.getNama() + " Telah Duduk");
            //penumpangPrioritas.add(penumpang);
            penumpangBiasa.add(penumpang);
            return true;
        }
        return false;
    }
    
    public void turunPenumpang()
    {
        System.out.print("Nama\t: ");
        nama = in.nextLine();
        turunkanPenumpang(nama);
    }
    
    public boolean turunkanPenumpang(String nama)
    {
        for(Penumpang penumpang : penumpangBiasa){
            String temp = penumpang.getNama();
            if(temp.equalsIgnoreCase(nama)){
                System.out.println("Penumpang Diturunkan");
                penumpangBiasa.remove(penumpang);
                return true;
            }
        }
        
        for(Penumpang penumpang : penumpangPrioritas){
            String temp = penumpang.getNama();
            if(temp.equalsIgnoreCase(nama)){
                penumpangPrioritas.remove(penumpang);
                System.out.println("Penumpang Diturunkan");
                return true;
            }
        }
        return false;
    }
    
    public String toString()
    {
        String temp = "Penumpang Prioritas = ";

        for(Penumpang penumpang : penumpangPrioritas){
            if(n!=0){
                temp += ", ";
            }
            temp += penumpang.getNama();
            n += 1;
        }
        if(n==0){
            temp += "Tidak Ada Penumpang";
        }
        temp += "\nPenumpang Biasa = ";
        n = 0;
        
        for(Penumpang penumpang : penumpangBiasa){
            if(n!=0){
                temp += ", ";
            }
            temp += penumpang.getNama();
            n += 1;
        }
        if(n==0){
            temp += "Tidak Ada Penumpang";
        }
        
        temp += "\nJumlah Penumpang = "+Integer.toString(penumpangBiasa.size() + penumpangPrioritas.size());
        
        return temp;
    }
}
