public class DataDosen13 {
    Dosen13 [] dataDosen = new Dosen13[10];
    int idx =0;

    void tambah(Dosen13 dsn){
        if (idx<dataDosen.length) {
            dataDosen[idx]=dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampilInformasi();
            System.out.println("---------------------------");
        }
    }
    void sortingASC(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = i+1; j < idx-i; j++) {
                if (dataDosen[j].usia < dataDosen[j-1].usia) {
                    Dosen13 temp = dataDosen[j];
                    dataDosen[j]=dataDosen[j-1];
                    dataDosen[j-1] = temp;
                }
            }
        }
    }
    void sortingDSC(){
        for (int i = 0; i < idx-1; i++) {
            int idxx = i;
            for (int j  = i+1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxx].usia) {
                    idxx=j;
                }
            }
            Dosen13 temp = dataDosen[idxx];
            dataDosen[idxx] = dataDosen[i];
            dataDosen[i] = temp; 
        }
    }
    void insertionSort(){
        for (int i = 0; i < dataDosen.length; i++) {
            Dosen13 temp = dataDosen[i];
            int j = i+1;
            while (j>0 && dataDosen[j-1].usia > temp.usia) {
                dataDosen[j]=dataDosen[j-1];
                j--;
            }
            dataDosen[j-1] = temp;
        }
    }
    int pencarianDataSequential(String nama){
        int data = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampilInformasi();
                System.out.println("-----------------");
                data++;
            }
        }
        if (data > 1) {
            System.out.println("Peringatan!"+
                        " Ada lebih dari satu dosen dengan nama " + nama);
        }
        return data;
    }
    int pencarianDataBinary(int usia){
        sortingASC();
        int left = 0, right = idx -1;
        int data = 0;
        while (left<=right) {
            int mid = (left+right)/2;
            if (dataDosen[mid].usia == usia) {
                for (int i = mid; i >= 0 && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampilInformasi();
                    data++;
                }
                for (int i = mid+1; i < idx && dataDosen[i].usia == usia; i++) {
                    System.out.println("-------------------");
                    dataDosen[i].tampilInformasi();
                    data++;
                }
                break;
            } else if (dataDosen[mid].usia> usia){
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        if (data > 1) {
            System.out.println("Peringatan!"+
                        " Ada lebih dari satu dosen dengan usia " + usia);
        }
        return data;
    }
}
