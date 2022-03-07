package tugasPraktikum1;
import java.util.*;

class Buku{
    String namaBuku;
    String kategori;
    String penulis;
    String sinopsis;

    void kategori (String kategori){
        this.kategori = kategori;
    }


}

class tugas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Buku[]buku = new Buku[3];
        for (int i = 0;i < buku.length;i++){
            buku[i] = new Buku();
        }
        
        int masukan;
        do {
            System.out.println("Selamat datang di aplikasi perpustakaan UB" + 
                            "\n1. Memasukan Kategori, Buku, dan Penulisnya" +
                            "\n2. Melihat isi Kategori yang telah dibuat" + 
                            "\n3. Keluar Aplikasi");
            masukan = input.nextInt();
        } while (masukan != 3); 
        
    }
}