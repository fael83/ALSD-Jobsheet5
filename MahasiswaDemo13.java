import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        Mahasiswa13 m [] = new Mahasiswa13[5];
        System.out.print("Masukkan jumlah mahasiswa :");
        int jumMhs=sc.nextInt();
        // Mahasiswa13 m1 = new Mahasiswa13("123", "Zidan", "2A", 3.2);
        // Mahasiswa13 m2 = new Mahasiswa13("124", "Ayu", "2A", 3.5);
        // Mahasiswa13 m3 = new Mahasiswa13("125", "Sofi", "2A", 3.1);
        // Mahasiswa13 m4 = new Mahasiswa13("126", "Sita", "2A", 3.9);
        // Mahasiswa13 m5 = new Mahasiswa13("127", "Miki", "2A", 3.7);
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Masukkan nama mahasiswa ke "+ (i+1) + " : ");
            String nama = sc.next();
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = sc.next();
            System.out.print("Masukkan kelas mahasiswa: ");
            String kelas = sc.next();
            System.out.print("Masukkan IPK mahasiswa: ");
            double ipk = sc.nextDouble();
            System.out.println("-----------------------------------");

            m [i] = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m[i]);
        }

        System.out.println("Data mahasisswa sebelum g");
        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("===================================");
        System.out.println("pencarian data");
        System.out.println("------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // melakukan pencarian data binary
        System.out.println("======================================");
        System.out.println("pencarian data");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang di cari: ");
        System.out.print("IPK :");
        double cari2 = sc.nextDouble();
        System.out.println("------------------------------");
        System.out.println("mengggunakan binary search");
        System.out.println("-------------------------------");
        double posisi2 = list.findBinariSearch(cari2, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selestionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
    }
}
