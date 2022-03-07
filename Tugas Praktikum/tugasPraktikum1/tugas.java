package tugasPraktikum1;
import java.util.*;

class c_Kategori{
    private String namaKategori;

    c_Kategori(String nama){
        namaKategori = nama;
    }
    void setNamaK(String nama){
        this.namaKategori = nama;
    }
    String getNamaK(){
        return this.namaKategori;
    }
}

class c_Buku{
    private String namaBuku;
    private String sinopsis;

    // Buku
    c_Buku (String nama, String sinopsis){
        this.namaBuku = nama;
        this.sinopsis = sinopsis;
    }
    String getNamaB(){
        return this.namaBuku;
    }
    String getSinopsis(){
        return this.sinopsis;
    }
    int getSinopsisLength(){
        return sinopsis.length();
    }
}

class c_Penulis{
    private String namaPenulis1;
    private String namaPenulis2;

    c_Penulis (String penulis1, String penulis2){
        this.namaPenulis1 = penulis1;
        this.namaPenulis2 = penulis2;
    }

    String getNamaP1(){
        return this.namaPenulis1;
    }

    String getNamaP2(){
        return this.namaPenulis2;
    }
}
public class tugas {
    public static Scanner input = new Scanner(System.in);
    
    // Pembuatan Array kategori, Buku, Penulis
    public static c_Kategori kategori[] = new c_Kategori[3];
    public static c_Buku buku[] = new c_Buku[6];
    public static c_Penulis penulis[] = new c_Penulis[6];

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("Selamat datang di aplikasi perpustakaan UB" + 
                             "\n1. Memasukan Kategori, Buku, dan Penulisnya" +
                             "\n2. Melihat isi kategori yang telah dibuat" +
                             "\n3. Keluar Aplikasi");
            System.out.print("Masukan pilihan : "); 
            pilih = input.nextInt();input.nextLine();
            switch(pilih){
                case 1 :
                    indeks();
                    break;
                case 2 :
                    print();
                    break;
                case 3 : 
                    System.out.println("Terimakasih telah menggunakan aplikasi perpustakaan UB");
                    break;
                } 
        } while (pilih != 3);
    }
    
    public static void indeks(){
        int x = 0; // untuk membantu dalam penempatan array buku, sinopsis, dan penulis

        for (int i = 0; i < kategori.length; i++){
            System.out.print("Masukan nama kategori ke-" + (i + 1) + " : ");
            kategori[i] = new c_Kategori(input.nextLine());
             
            for (int j = 0; j < 2; j++){ 
                System.out.print("Masukan nama buku ke-" + (j + 1) + " : ");
                String nama = input.nextLine();
                System.out.print("Masukan sinopsis buku ke-" + (j + 1) + " : ");
                String sinopsis = input.nextLine();
                buku[x] = new c_Buku(nama, sinopsis);
                
                System.out.print("Masukan penulis ke-1 : ");
                String penulis1 = input.nextLine();

                System.out.println("Apakah penulis hanya ada 1? (Y/N)");
                String penulis2;
                String pilihan = input.nextLine();
                if (pilihan.equalsIgnoreCase("Y")){
                    penulis2 = null;    
                } else {
                    System.out.print("Masukan penulis ke-2 : ");
                    penulis2 = input.nextLine();
                }
                penulis[x] = new c_Penulis(penulis1, penulis2);            
                x += 1;
            }
        }          
    }

    public static void print(){
        int x = 0; // untuk membantu dalam mengakses array buku sinopsis, dan penulis
        System.out.println("");
        
        for (int i = 0; i < kategori.length;i++){
            System.out.println("Kategori ke-" + (i + 1) + " adalah : " + kategori[i].getNamaK());  
            for (int j = 0; j < 2; j++){
                System.out.println("Buku ke-" + (j + 1) + " untuk kategori tersebut adalah" + buku[x].getNamaB());
                System.out.println("Sinopsis : " + buku[x].getSinopsis()); 
                System.out.println("Panjang perhuruf Sinopsis : " + buku[x].getSinopsisLength());
                System.out.println("Penulis ke 1 untuk buku tersebut adalah : " + penulis[x].getNamaP1());
                System.out.println("Penulis ke 2 untuk buku tersebut adalah : " + penulis[x].getNamaP2());   
                x += 1;
            }
            
            System.out.println("");
            System.out.println("==================================================================================");
            System.out.println("");
        }
    }
}
