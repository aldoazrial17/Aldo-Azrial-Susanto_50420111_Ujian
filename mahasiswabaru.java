package checkhadir;

public class mahasiswabaru {
    private final String nama;
    private final String npm;
    private final String kelas;
    private final String jk;
    private final int tinggi;
    
    public mahasiswabaru(String nama, String npm, String kelas, String jk, int tinggi) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
        this.jk = jk;
        this.tinggi = tinggi;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNpm() {
        return npm;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public String getJenisKelamin(){
        return jk;
    }
    
    public int getTinggi() {
        return tinggi;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama + ", NPM : " + npm + ", Kelas: " + kelas + ", jenis Kelamin: " + jk + " Tinggi: " + tinggi;
    }
}