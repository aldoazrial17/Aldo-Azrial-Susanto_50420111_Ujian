package checkhadir;
import java.util.ArrayList; 
import javax.swing.table.DefaultTableModel; 

public class ControllerMahasiswa { 
    ArrayList<mahasiswabaru> ArrayData; 
    DefaultTableModel tablelist; 
	
    public ControllerMahasiswa(){ 
        ArrayData = new ArrayList<mahasiswabaru>(); 
    } 
    public void InsertData(String nama, String npm, String kelas, String jk, int tinggi){ 
        mahasiswabaru mhs = new mahasiswabaru(nama, npm, kelas, jk, tinggi); 
        ArrayData.add(mhs); 
    } 
    
    public DefaultTableModel showData(){ 
	String[] kolom = {"Nama", "NPM", "Kelas", "Jenis Kelamin", "Tinggi"}; 
	Object[][] objData = new Object[ArrayData.size()][3]; 
	int i = 0; 

	for(mahasiswabaru n : ArrayData){ 
            String[] arrData = {n.getNama(), n.getNpm(), n.getKelas(), n.getJenisKelamin(), String.valueOf(n.getTinggi())}; 
            objData[i] = arrData; 
            i++; 
        }

	tablelist = new DefaultTableModel(objData, kolom){ 
                public boolean inCellEditTable(int rowIndex, int colIndex){ 
		return false; 
            } 
	}; 

	return tablelist;
	}
        
    public void deleteData(String npm) {
        for(mahasiswabaru mhs : ArrayData) {
            if (mhs.getNpm().equals(npm)) {
                ArrayData.remove(mhs);
                break;
            }
        }
    }
}
