
/**
 * Write a description of class Penumpang here.
 * Class ini di buat untuk mengisi data dari penumpang dan juga mengembalikan data serta di gunakan pada class Bus
 *
 * @author Muammar Yasir    
 * @version 1.0 12/03/2020
 */
public class Penumpang
{
    private String nama;
    private int umur;
    private boolean hamil;
    
    public Penumpang(String nama, int umur, boolean hamil)
    {
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }

    public String getNama()
    {
        return this.nama;
    }
    
    public int getUmur()
    {
        return this.umur;
    }
    
    public boolean getHamil()
    {
        return this.hamil;
    }
}
