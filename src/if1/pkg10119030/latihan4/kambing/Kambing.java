package if1.pkg10119030.latihan4.kambing;
/**
 * Nama     : Rendy Dermawan
 * Kelas    : IF-1
 * NIM      : 10119030
 * Deskripsi Program : Program ini dibuat untuk Memasukkan 
 * Kambing kedalam Program
 */
public class Kambing {
    public void tambahKambing(){
        // Deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + 
                            jumlahKambing);
    }

    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }  
}
