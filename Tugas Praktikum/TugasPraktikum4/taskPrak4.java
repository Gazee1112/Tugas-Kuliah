import java.time.LocalDate;  

class Manusia{
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;
    private double tunjangan = 0;
    private double pendapatan = 0;

    Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama; 
        this.nik = nik;
        this.jenisKelamin = jenisKelamin; 
        this.menikah = menikah;
    }
    //getter
    public String getNama(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }
    public String getJenisKelamin(){
        String jenisKelamin = null;
        if (this.jenisKelamin == true){
            jenisKelamin = "laki-laki";
        } else {
            jenisKelamin = "perempuan";
        }
        return jenisKelamin;
    }
    public boolean getMenikah(){
        return this.menikah;
    }
    public void setTunjangan (double tunjangan){
        this.tunjangan = tunjangan;
    }
    public double getTunjangan(){
        if (this.jenisKelamin == true && this.menikah == true){
            this.tunjangan += 25000;
        } else if (this.jenisKelamin == false && this.menikah == true){
            this.tunjangan += 20000;
        } else if (this.menikah == false){
            this.tunjangan += 15000;
        }
        return this.tunjangan;
    }

    public void setPendapatan(double tambah){
        this.pendapatan += tambah;
    }

    public double getPendapatan(){
        getTunjangan();
        return this.pendapatan + this.tunjangan;
    }

    //to String
    public String toString(){
        return "Nama            : " + nama 
            +"\nNik             : " + nik 
            +"\nJenis Kelamin   : " + getJenisKelamin() 
            +"\npendapatan      : " + getPendapatan();
    }
}
class Mahasiswa extends Manusia{
    private String nim;
    private double ipk = 0;
    
    Mahasiswa (String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama,nik,jenisKelamin,menikah);
        this.nim = nim; 
        this.ipk = ipk;
    }

    public String getStatus(){
        String prodi = null;
        String kodeProdi = nim.substring(6,7);
        if (kodeProdi.equals("2")){
            prodi = "Teknik Informatika";
        } else if (kodeProdi.equals("3")){
            prodi = "Teknik Komputer";
        } else if (kodeProdi.equals("4")){
            prodi = "Sistem Informasi";
        } else if (kodeProdi.equals("6")){
            prodi = "Pendidikan Teknologi Informasi";
        } else if (kodeProdi.equals("7")){
            prodi = "Teknologi Informasi";
        } else {
            prodi = "Tidak Ditemukan";
        }
        return prodi + "," + 20 + nim.substring(0,2);
    }

    public double getBeasiswa(){
        double beasiswa = 0;
        if (this.ipk > 3.5){
            beasiswa += 75000;
        } else if (this.ipk > 3.0){
            beasiswa += 50000;
        }
        return beasiswa;
    }

    public double getPendapatan(){
        return super.getPendapatan() + getBeasiswa(); 
    }

    public String toString(){
        return "Nama            : " + super.getNama()
            +"\nNik             : " + super.getNik()
            +"\nJenis Kelamin   : " + getJenisKelamin() 
            +"\npendapatan      : " + getPendapatan() 
            +"\nnim             : " + this.nim
            +"\nstatus          : " + getStatus();
    }
}

class Pekerja extends Manusia{
    private double gaji;
    private int jumlahAnak;
    private LocalDate tahunMasuk;

    Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama,nik,jenisKelamin,menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public int getLamaKerja(){
        int tahunSekarang = LocalDate.now().getYear();
        int LamaKerja = tahunSekarang - this.tahunMasuk.getYear();
        return LamaKerja;
    }

    public double getBonus(){
        double bonus = 0.0;
        if (getLamaKerja() > 10){
            bonus = this.gaji * 0.15;
        } else if (getLamaKerja() > 5){
            bonus = this.gaji * 0.10;
        } else {
            bonus = this.gaji * 0.05;
        }
        return bonus;
    }

    public double getGaji(){
        return gaji;
    }

    public double getPendapatan(){
        if (jumlahAnak > 0){
            super.setTunjangan(20000);
        }
        return super.getPendapatan() + getGaji() + getBonus();
    }

    public String toString(){
        return "Nama            : " + super.getNama()
            +"\nNik             : " + super.getNik()
            +"\nJenis Kelamin   : " + getJenisKelamin() 
            +"\npendapatan      : " + getPendapatan() 
            +"\ntahun masuk     : " + this.tahunMasuk
            +"\njumlah anak     : " + this.jumlahAnak
            +"\ngaji            : " + getGaji();
    }

}
class taskPrak4{
    public static void main(String[] args) {
        var human = new Manusia("Bagas", "215150700111038", true, true);
        System.out.println(human);
        System.out.println();
        var b = new Mahasiswa("165150300111100", 4.0, "Syahrudin", "111", false, false);
        System.out.println(b);
        var c = new Pekerja(1000, LocalDate.of(2016, 2, 3), 4, "surti", "111", true, true);
        System.out.println(c);
        
    }


}