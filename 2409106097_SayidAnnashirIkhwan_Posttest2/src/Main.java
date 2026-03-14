import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<TiketKereta> daftarTiket = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n---Selamat datang di sistem pemesanan tiket kereta api tutut.id ><");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih menu anda : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahData();
                    break;

                case 2:
                    lihatData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    System.out.println("Terimakasih sudah, sampai berjumpa lagi ><");
                    break;

                default:
                    System.out.println("Maaf Menu Yang kamu cari  tidak tersedia");
            }

        } while (pilihan != 5);
    }

    static void tambahData() {

        System.out.print("Nama Penumpang : ");
        String nama = input.nextLine();

        System.out.print("Asal : ");
        String asal = input.nextLine();

        System.out.print("Tujuan : ");
        String tujuan = input.nextLine();

        System.out.print("Harga : ");
        int harga = input.nextInt();
        input.nextLine();

        TiketKereta tiket = new TiketKereta(nama, asal, tujuan, harga);
        daftarTiket.add(tiket);

        System.out.println("Data berhasil ditambahkan");
    }

    static void lihatData() {

        if (daftarTiket.isEmpty()) {
            System.out.println("Data kosong");
        } else {

            for (int i = 0; i < daftarTiket.size(); i++) {

                System.out.println("Data ke-" + (i + 1));
                daftarTiket.get(i).tampilkanData();

            }
        }
    }

    static void updateData() {

        lihatData();

        System.out.print("Pilih nomor data yang diubah : ");
        int index = input.nextInt() - 1;
        input.nextLine();

        System.out.print("Nama baru : ");
        String nama = input.nextLine();

        System.out.print("Asal baru : ");
        String asal = input.nextLine();

        System.out.print("Tujuan baru : ");
        String tujuan = input.nextLine();

        System.out.print("Harga baru : ");
        int harga = input.nextInt();
        input.nextLine();

        daftarTiket.set(index, new TiketKereta(nama, asal, tujuan, harga));

        System.out.println("Data berhasil diupdate");
    }

    static void hapusData() {

        lihatData();

        System.out.print("Pilih nomor data yang dihapus : ");
        int index = input.nextInt() - 1;
        input.nextLine();

        daftarTiket.remove(index);

        System.out.println("Data berhasil dihapus");
    }
}