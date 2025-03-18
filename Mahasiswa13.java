public class Mahasiswa13 {
    String nim, nama, kelas;
    double ipk;

    // Konstruktor default
    Mahasiswa13(){

    }

    // Komstruktor berparameter
    Mahasiswa13(String nm, String name, String kls, double ip){
        nim=nm;
        nama=name;
        ipk=ip;
        kelas=kls;
    }

    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: "+ ipk);
        System.out.println("Kelas: "+ kelas);
    }
}
