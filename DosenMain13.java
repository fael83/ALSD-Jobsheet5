import java.util.Scanner;

public class DosenMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen13 data = new DataDosen13();
        System.out.println("==Menu==");
        System.out.println("1. Tambah data dosen");
        System.out.println("2. Tampil data");
        // System.out.println("3. Mengurutkan data dosen dari yang termuda - tertua menggunakan BUBBLE SORT (ASC)");
        // System.out.println("4. Mengurutkan data dosen dari yang tertua - termuda menggunakan INSERTION SORT (DSC) ");
        // System.out.println("3. Urutkan data berdasarkan usia (ASC)");
        System.out.println("3. Cari dosen berdasarkan nama (Sequential Search)");
        System.out.println("4. Cari dosen berdasarkan usia (Binary Search) ");
        System.out.println("5. Keluar");

        while (true) {
        System.out.print("Pilih menu :");
        int menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan jumlah data:");
                int jumlah = sc.nextInt();
                Dosen13 [] dsn = new Dosen13[jumlah];
                for (int i = 0; i < dsn.length; i++) {
                    System.out.println("Masukkan data dosen ke " + (i +1) + ": ");
                    System.out.print("Kode: ");
                    String kode = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jk = sc.next();
                    Boolean jenisKelamin;
                    if (jk.equalsIgnoreCase("L")) {
                        jenisKelamin = true;
                    } else {
                        jenisKelamin = false;
                    }
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();

                    dsn [i] = new Dosen13(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn[i]);
                }
                System.out.println("===================");
            } else if (menu == 2) {
                data.tampil();
                System.out.println("===================");
            } else if (menu == 3) {
                System.out.print("Masukkan nama dosen yang dicari: ");
                String cariNama=sc.next();
                int hasil = data.pencarianDataSequential(cariNama);
                if (hasil == 0) {
                    System.out.println("Data tidak ditemukan");
                }
                System.out.println("=====================");
            } else if (menu == 4) {
                System.out.print("Masukkan usia dosen yang dicari: ");
                int cariUsia=sc.nextInt();
                int hasil = data.pencarianDataBinary(cariUsia);
                if (hasil == 0) {
                    System.out.println("Data tidak ditemukan");
                }
                System.out.println("=====================");
            } else if (menu == 5) {
                System.out.println("Terima kasih");
                break;
            } if (menu < 1 && menu > 5) {
                System.out.println("Masukkan angkan 1-5");
                System.out.println("==================");
            } 
        }
    }
}
