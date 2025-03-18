public class DataDosen13 {
    Dosen13 [] dataDosen = new Dosen13[10];
    int idx;

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
}
