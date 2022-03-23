import java.util.*;

class perhitungan {
    public static int penjumlahan (int a, int b){
        return a + b;
    }
    public static int pengurangan (int a, int b){
        return a - b;
    }
    public double perkalian (double a, double b){
        return a * b;
    }
    public double pembagian (double a, double b){
        return a / b;
    }
    public int sederhana (double a){
        return (int)Math.round(a);
    }
}

class produksi{
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;

    public int getJaketA(){
        return this.jaketA;
    }
    public int getJaketB(){
        return this.jaketB;
    }
    public int getJaketC(){
        return this.jaketC;
    }

}

class Main{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        perhitungan hitung = new perhitungan();
        produksi produk = new produksi();

        System.out.println("============================ CV. Labkomdas ===========================");
        System.out.println("Selamat datang, Perusahaan produksi jacket, ingin mememasan jaket apa?" + 
                         "\nPilihan : " +
                         "\n1. Jaket A (Rp. 100.000 per unit)" + 
                         "\n2. Jaket B (Rp. 125.000 per unit)" +
                         "\n3. Jaket C (Rp. 175.000 per unit)");
        System.out.println("Pilihan (A, B, C) : ");
        String pilih = input.nextLine();
        System.out.println("Banyak barang yang ingin di pesan : ");
        int jumlah = input.nextInt();

        double harga = 0;
        if (pilih.equalsIgnoreCase("A")){
            if (jumlah > 100){
                harga = hitung.perkalian(produk.getJaketA()*0.95, jumlah);
            }
            else {
                harga =  hitung.perkalian(produk.getJaketA(), jumlah);
            }
        } else if (pilih.equalsIgnoreCase("B")){
            if (jumlah > 100){
                harga = hitung.perkalian(produk.getJaketB()*0.95, jumlah);
            }
            else {
                harga =  hitung.perkalian(produk.getJaketB(), jumlah);
            }
        } else if (pilih.equalsIgnoreCase("C")){
            if (jumlah > 100){
                harga = hitung.perkalian(produk.getJaketC()*0.95, jumlah);
            }
            else {
                harga =  hitung.perkalian(produk.getJaketC(), jumlah);
            }
        } else {
            System.out.println("Masukan Pilihan yang benar");
        }
        
        System.out.printf("Harga Jaket : Rp. %,.2f", harga); 
        System.out.println("");
    }
}