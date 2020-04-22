package Tugas;

public class Air {
    public static void main(String[] args) {
        int isiBakMandi = 0;
        int Full = 1500;

        System.out.println("Tampungan Bak Mandi Sekarang : " + isiBakMandi + "L");
        System.out.println("Tampungan Bak Mandi saat Penuh : " + Full + "L");

        for(isiBakMandi = 0 ; isiBakMandi != Full ; isiBakMandi=isiBakMandi+50){
            System.out.println("Sedang mengisi Bak Mandi ...");
            System.out.println("Tampungan Bak Mandi Sekarang : " + isiBakMandi + "L");
        }
        System.out.println("Bak Mandi sudah terisi Penuh : " + Full + "L");
    }
}
