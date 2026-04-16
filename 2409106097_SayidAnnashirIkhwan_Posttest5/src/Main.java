import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<TiketKereta> data = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tambah();
                    break;
                case 2:
                    lihat();
                    break;
            }

        } while (pilih != 3);
    }

    static void tambah() {

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Asal: ");
        String asal = input.nextLine();

        System.out.print("Tujuan: ");
        String tujuan = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();

        System.out.print("Jumlah tiket: ");
        int jumlah = input.nextInt();

        System.out.print("Pilih kelas (1. Ekonomi / 2. Eksekutif): ");
        int jenis = input.nextInt();
        input.nextLine();

        TiketKereta t;

        if (jenis == 1) {
            t = new KeretaEkonomi(nama, asal, tujuan, harga);
        } else {
            t = new KeretaEksekutif(nama, asal, tujuan, harga);
        }

        int total = t.hitungHarga(harga, jumlah);

        System.out.println("Total Harga: " + total);

        data.add(t);
    }

    static void lihat() {

        for (TiketKereta t : data) {
            t.tampilkanData();
            t.infoKelas();

            if (t instanceof Fasilitas) {
                ((Fasilitas) t).wifi();
                ((Fasilitas) t).makanan();
            }

            System.out.println("-------------------");
        }
    }
}