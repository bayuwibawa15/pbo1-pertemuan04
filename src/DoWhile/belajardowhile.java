package DoWhile;

public class belajardowhile {
    public static void main(String[] args) {
        int isiGelas = 225;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas..");
            System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
        }while (isiGelas != penuh);
        System.out.println("Finally : Isi Gelas Sekarang : " + isiGelas + "ml");
    }
}
