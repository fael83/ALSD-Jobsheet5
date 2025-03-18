public class Dosen13 {

    String kode, nama;
    Boolean jenisKelamin;
    int usia;

    Dosen13(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampilInformasi(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
}