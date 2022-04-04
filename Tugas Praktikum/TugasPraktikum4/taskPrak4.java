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
    public String getNama(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }
    public String getMenikah(){
        String statusMenikah = null;
        if (this.menikah == true){
            statusMenikah = "Menikah";
        } else {
            statusMenikah = "Belum Menikah";
        }
        return statusMenikah;
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
    public void setTunjangan (double tunjangan){
        this.tunjangan += tunjangan;
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
        double pendapatan = 0;
        getTunjangan();
        if (this.jenisKelamin == true){
            pendapatan = 50_000;
        } else if(this.jenisKelamin == false) {
            pendapatan = 30_000;
        }
        return this.pendapatan + this.tunjangan + pendapatan;
    }
    public String toString(){
        return "Nama            : " + nama 
            +"\nNIK             : " + nik 
            +"\nJenis Kelamin   : " + getJenisKelamin() 
            +"\nPendapatan      : " + getPendapatan();
    }
}
class Mahasiswa extends Manusia{
    private String nim;
    private double ipk;
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
            +"\nNIK             : " + super.getNik()
            +"\nJenis Kelamin   : " + getJenisKelamin() 
            +"\nPendapatan      : " + getPendapatan() 
            +"\nNIM             : " + this.nim
            +"\nStatus          : " + getStatus();
    }
}

class Dosen extends Manusia{
    private double gaji;
    private int jumlahAnak;
    private LocalDate tahunMasuk;

    Dosen(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
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
            super.setTunjangan(jumlahAnak * 20000);
        }
        return super.getPendapatan() + getGaji() + getBonus();
    }

    public String toString(){
        return "Nama            : " + super.getNama()
            +"\nNik             : " + super.getNik()
            +"\nJenis Kelamin   : " + getJenisKelamin() 
            +"\nPendapatan      : " + getPendapatan() 
            +"\nWaktu masuk     : " + this.tahunMasuk 
            +"\nLama Kerja      : " + getLamaKerja() + " tahun"
            +"\nStatus          : " + super.getMenikah()
            +"\nJumlah anak     : " + this.jumlahAnak
            +"\nGaji            : " + getGaji();
    }

}
class taskPrak4{
    public static void main(String[] args) {
        // MANUSIA
        // Nama, NIK, jenis Kelamin (true = laki, false = wanita), menikah(true/false)
        var manusia1 = new Manusia("Bagas", "1112", true, true);
        var manusia2 = new Manusia("Mahda", "1113", true, false);
        var manusia3 = new Manusia("Dania", "1114", false, false);
        System.out.println("MANUSIA");
        System.out.println(manusia1);
        System.out.println("====================================================");
        System.out.println(manusia2);
        System.out.println("====================================================");
        System.out.println(manusia3);
        System.out.println("====================================================");
        System.out.println("");

        //MAHASISWA
        // NIM, IPK, Nama, NIK, jenis Kelamin (true = laki, false = wanita), menikah(true/false)
        var mahasiswa1 = new Mahasiswa("165150300111100", 4.0, "Aland", "1115", true, false);
        var mahasiswa2 = new Mahasiswa("175150200122159", 2.9, "Putri", "1116", false, false);
        var mahasiswa3 = new Mahasiswa("215150700111045", 3.4, "Nisa", "1117", false, true);
        System.out.println("MAHASISWA");
        System.out.println(mahasiswa1);
        System.out.println("====================================================");
        System.out.println(mahasiswa2);
        System.out.println("====================================================");
        System.out.println(mahasiswa3);
        System.out.println("====================================================");
        System.out.println("");

        //DOSEN
        // gaji, tahun masuk, jumlah anak, Nama, NIK, jenis Kelamin (true = laki, false = wanita), menikah(true/false)
        var dosen1 = new Dosen(1000_000, LocalDate.of(2019, 1, 1), 0, "Zahra", "1118", false, false);
        var dosen2 = new Dosen(2000_000, LocalDate.of(2014, 3, 2), 2, "Randi", "1119", true, true);
        var dosen3 = new Dosen(3000_000, LocalDate.of(2003, 12, 11), 5, "Stefan", "1120", true, true);
        System.out.println("DOSEN");
        System.out.println(dosen1);
        System.out.println("====================================================");
        System.out.println(dosen2);
        System.out.println("====================================================");
        System.out.println(dosen3);
        System.out.println("====================================================");
        System.out.println("");
        
    }


}