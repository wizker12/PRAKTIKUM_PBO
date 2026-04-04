import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<TiketKereta> daftarTiket = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== SISTEM TIKET KERETA ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
            }

        } while (pilihan != 3);
    }

    static void tambahData() {

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Asal: ");
        String asal = input.nextLine();

        System.out.print("Tujuan: ");
        String tujuan = input.nextLine();

        System.out.print("Harga: ");
        int harga = input.nextInt();

        System.out.print("Pilih Kelas (1. Ekonomi / 2. Eksekutif): ");
        int jenis = input.nextInt();
        input.nextLine();

        TiketKereta tiket;

        if (jenis == 1) {
            tiket = new KeretaEkonomi(nama, asal, tujuan, harga);
        } else {
            tiket = new KeretaEksekutif(nama, asal, tujuan, harga);
        }

        daftarTiket.add(tiket);
        System.out.println("Data ditambahkan!");
    }

    static void lihatData() {

        for (TiketKereta tiket : daftarTiket) {
            tiket.tampilkanData();

            if (tiket instanceof KeretaEkonomi) {
                ((KeretaEkonomi) tiket).infoKelas();
            } else {
                ((KeretaEksekutif) tiket).infoKelas();
            }

            System.out.println("----------------------");
        }
    }
}