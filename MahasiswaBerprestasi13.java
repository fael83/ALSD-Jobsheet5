public class MahasiswaBerprestasi13 {
    Mahasiswa13[]listMhs=new Mahasiswa13[5];
    int idx;

    void tambah(Mahasiswa13 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("------------------------");
            }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa13 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    void selestionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa13 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            Mahasiswa13 temp = listMhs[i];
            int j =i;
            while (j>0  && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
    int sequentialSearching(double cari){
        int posisi = -1;
        for(int j =0; j<listMhs.length;j++){
            if (listMhs[j].ipk == cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan ipk :" +x+ " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos!=-1) {
            System.out.println("nim\t :"+listMhs[pos].nim);
            System.out.println("nama\t :" + listMhs[pos].nama);
            System.out.println("kelas\t :" + listMhs[pos].kelas);
            System.out.println("ipk\t :" + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x+ " tidak ditemukan");
        }
    }
    int findBinariSearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid = (left+right)/2;
            if (cari == listMhs[mid].ipk) {
                return(mid);
            } else if (listMhs[mid].ipk>cari) {
                return findBinariSearch(cari, mid+1, right);
            } else {
                return findBinariSearch(cari, left, mid-1);
            }
        }
        return -1;
    }
}
