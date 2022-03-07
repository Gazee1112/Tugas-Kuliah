package tugasPraktikum1;
import java.util.*;

class Kategori{
    private Buku book[];
    private String namaKategori;
    
    Kategori(String nama){
        this.namaKategori = nama;
    }
    void setBook(Buku book[]){
        this.book = book;
    }
    void setNama(String nama){
        this.namaKategori = nama;
    }
    Buku[] getBuku(){
        return this.book;
    }
    Buku getBuku (int indek){
        return this.book[indek];
    }
    String getNamaKategori(){
        return this.namaKategori;
    }

}
class Buku{
    private String namaBuku;
    private String sinopsis;
    private Penulis penulis[];

    Buku (String nama, String sinopsis){
        this.namaBuku = nama;
        this.sinopsis = sinopsis;
    }
    void setPenulis(Penulis penulis[]){
        this.penulis = penulis;
    }
    void setNama(String nama){
        this.namaBuku = nama;
    }
    String getNama(){
        return this.namaBuku;
    }
    Penulis[]getPenulis(){
        return this.penulis;
    }
    Penulis getPenulis(int indek){
        return this.penulis[indek];
    }
    String getSinopsis(){
        return this.sinopsis;
    }
    int getSinopsisLength(){
        return sinopsis.length();
    }
    
}

class Penulis{
    private String namaPenulis;

    Penulis(){
    }
    Penulis(String nama){
        this.namaPenulis = nama;
    }
    void setNamaPenulis(String nama){
        this.namaPenulis = nama;
    }
    String getNamaPenulis(){
        return this.namaPenulis;
    }
}

class tugas{
    public static Scanner input = new Scanner(System.in);
    public static Kategori kategori[] = new Kategori[3];
    public static void main(String[] args) {
        System.out.println("Selamat datang di aplikasi perpustakaan UB" + 
                         "\n1. Memasukan Kategori, Buku, dan Penulisnya" +
                         "\n2. Melihat isi kategori yang telah dibuat" +
                         "\n3. Keluar Aplikasi");
        int pilih = input.nextInt();input.nextLine();
        
        switch(pilih){
            case 1 :
                indek();
                break;
            case 2 :
                break;
            case 3 : 
                System.out.println("Terimakasih telah menggunakan aplikasi perpustakaan UB");
                break;
        }
    }

    public static void indek(){
        for (int i = 0; i < kategori.length; i++){
            System.out.println("Masukan nama kategori ke-" + i + " : ");
            kategori[i] = new Kategori(input.nextLine());
            Buku[] buku = new Buku[2];
            for (int j = 0; j < buku.length; j++){
                System.out.println("Masukan nama buku ke-" + j + " : ");
                String nama = input.next();
                System.out.println("Masukan sinopsis buku ke-" + j + " : ");
                String penulis = input.next();
                buku[j] = new Buku (nama,penulis);
                Penulis penuliss[] = new Penulis [2];
                for (int k = 0; k < penuliss.length; k++){
                    penuliss[k] = new Penulis();
                }
            }
        }
    }
}