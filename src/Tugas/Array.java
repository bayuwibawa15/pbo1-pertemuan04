package Tugas;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[], ntt, ntr;
        float rata, jumlah = 0;
        String nama[];

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        n = input.nextInt();

        nilai = new int[n];
        nama = new String[10];

        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }


        for(int j=0;j<= n-1;j++){
            jumlah = jumlah + nilai[j];
        }


        rata = jumlah/n;


        ntt = nilai[0];
        ntr = nilai[0];


        for(int k=0;k<=n-1;k++){
            if(ntt < nilai[k]){
                ntt = nilai[k];
            }
            if(ntr > nilai[k]){
                ntr = nilai[k];
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("- Daftar Nilai Pemrograman Berbasis Objek -");
        System.out.println("-------------------------------------------");
        System.out.println("- Nilai rata-rata kelas : " + rata);
        System.out.println("- Nilai Tertiggi = " + ntt);
        System.out.println("- Nilai Terendah = " + ntr);
        System.out.println("-------------------------------------------");
    }
}