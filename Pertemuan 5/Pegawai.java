
/**
 * Write a description of class Pegawai here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pegawai {
    private String nama;
    private double gaji;
    
    /* method constructor ini digunakan
    untuk menciptakan suatu objek dengan parameter*/
    public Pegawai(String nama, double gaji)
    {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    /* method Mutator yang digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /* method Accessor ini yang digunakan untuk mengembalikan
    nilai dari nama*/
    public String getNama()
    {
        return nama;
    }
    
    /* method Mutator yang digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    public void setGaji(double gaji)
    {
        this.gaji = gaji;
    }
    
    /* method Accessor ini yang digunakan untuk mengembalikan
    nilai dari gaji*/
    public double getGaji()
    {
        return gaji;
    }
}
