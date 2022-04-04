public class test {
    public static void main(String[] args) {
        String kode = "215150700111048";

        String kode2 = kode.substring(6,7);
        System.out.println(kode2);

        String prodi = null;

        String kodeProdi = kode.substring(6,7);

        if (kodeProdi == "2"){
            prodi = "Teknik Informatika";
        } else if (kodeProdi == "3"){
            prodi = "Teknik Komputer";
        } else if (kodeProdi == "4"){
            prodi = "Sistem Informasi";
        } else if (kodeProdi == "6"){
            prodi = "Pendidikan Teknologi Informasi";
        } else if (kodeProdi == "7"){
            prodi = "Teknologi Informasi";
        }else {
            prodi = "Tidak Ditemukan";
        }
        
        System.out.println(prodi);
    }
}
