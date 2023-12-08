package checkhadir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckHadir {
    public static void main(String[] args) {
        List<mahasiswabaru> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Tambah Data mahasiswa Baru (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("NPM: ");
            String npm = input.nextLine();
            
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            
            System.out.print("Jenis Kelamin: ");
            String jk = input.nextLine();
            
            System.out.print("Tinggi: ");
            int tinggi = input.nextInt();
            input.nextLine();
            
            mahasiswabaru mahasiswa = new mahasiswabaru(nama, npm, kelas, jk, tinggi);
            daftarMahasiswa.add(mahasiswa);
            
        }
        System.out.println("Daftar Mahasiswa: ");
        for (mahasiswabaru mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa);
        }
    }
    
}
