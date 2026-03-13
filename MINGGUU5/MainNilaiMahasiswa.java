package MINGGUU5;

public class MainNilaiMahasiswa {

    public static void main(String[] args) {

        String nama[] = {
            "Ahmad","Budi","Cindy","Dian",
            "Eko","Fajar","Gina","Hadi"
        };

        int uts[] = {78,85,90,76,92,88,80,82};
        int uas[] = {82,88,87,79,95,85,83,84};

        int elemen = uts.length;

        NilaiMahasiswa nm = new NilaiMahasiswa(elemen);

        for(int i = 0; i < elemen; i++){
            nm.uts[i] = uts[i];
            nm.uas[i] = uas[i];
        }

        int maxUTS = nm.maxUTS(nm.uts, 0, elemen-1);
        int minUTS = nm.minUTS(nm.uts, 0, elemen-1);

        int indexMax = 0;
        int indexMin = 0;

        for(int i = 0; i < elemen; i++){
            if(uts[i] == maxUTS){
                indexMax = i;
            }
            if(uts[i] == minUTS){
                indexMin = i;
            }
        }

        System.out.println("Nilai UTS Tertinggi = " + maxUTS + " (Mahasiswa: " + nama[indexMax] + ")");
        System.out.println("Nilai UTS Terendah = " + minUTS + " (Mahasiswa: " + nama[indexMin] + ")");
        System.out.println("Rata-rata Nilai UAS = " + nm.rataUAS());
    }
}