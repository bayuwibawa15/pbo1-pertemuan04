package Array;

public class belajararray3 {
    public static void main(String[] args) {
        double[][] nilaiMhs = new double[5][30];
        double bobot[] ={0.25,0.25,0.25,0.25};

        nilaiMhs[0][0] = 80;
        nilaiMhs[1][0] = 90;
        nilaiMhs[2][0] = 75;
        nilaiMhs[3][0] = 70;




        nilaiMhs[4][0] = nilaiMhs[0][0] * bobot [0] +
                nilaiMhs[1][0] * bobot [1] +
                nilaiMhs[2][0] * bobot [2] +
                nilaiMhs[3][0] * bobot [3];

        System.out.println("Nilai Mahasiswa 1 : " + nilaiMhs[4][0]);

        nilaiMhs[0][1] = 80;
        nilaiMhs[1][1] = 90;
        nilaiMhs[2][1] = 75;
        nilaiMhs[3][1] = 70;

        nilaiMhs[4][1] = 0;
        for(int i=0 ; i<=3 ; i++){
            nilaiMhs[4][1] += nilaiMhs[i][1] * bobot[i];
        }

        System.out.println("Nilai Mahasiswa 2 : " + nilaiMhs[4][1]);

        double jumlahNilaiAkhir = 0;
        for(int i=0 ; i<=3 ; i++){
            jumlahNilaiAkhir += nilaiMhs[4][i];
        }
        System.out.println(jumlahNilaiAkhir);
    }
}
