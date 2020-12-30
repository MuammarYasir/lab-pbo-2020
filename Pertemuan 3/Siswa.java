
/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa
{
    private int nrp;
    private String nama;
    

    public Siswa(int nrpx, String namax)/* method constructor ini digunakan
    untuk menciptakan suatu objek */
    {
        nrp = nrpx;
        nama = namax;
    }

    public void setNrp(int nrpx)/* method Mutator yang digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    {
        nrp = nrpx;
    }
    
    public int getNrp()/* method Accessor ini yang digunakan untuk mengembalikan
    nilai dari nrp*/
    {
        return nrp;
    }
    
    public void setNama(String namax)/* method Mutator ini digunakan untuk mengubah
    suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    {
        nama = namax;
    }
    
    public String getNama()/*method accessor ini untuk mengembalikan string nama*/
    {
        return nama;
    }
}
