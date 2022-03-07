package tugasPraktikum1;
import java.util.*;

class Buku{
    String namaBuku;
    String kategori;
    String penulis;
    String sinopsis;

    Buku(String kategori){
        this.kategori = kategori;
    }

    void display(){
        System.out.println("Kategori                        : " + this.kategori
                        +"\nBuku untuk kategori tersebut    : " + this.namaBuku
                        +"\nSinopsis                        : " + this.sinopsis
                        +"\nPenulis                         : " + this.penulis);
    }


}

class tugas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kategori = input.next();

        for (int i = 0; i < 3; i++){
            System.out.println("Memasukan nama kategori ");
            kategori = input.next();
        }


        Buku buku1 = new Buku (kategori);
        buku1.display();
    }
}