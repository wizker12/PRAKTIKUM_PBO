abstract class TiketKereta {

    protected String nama;
    protected String asal;
    protected String tujuan;
    protected int harga;

    TiketKereta(String nama, String asal, String tujuan, int harga) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }


    abstract void infoKelas();


    int hitungHarga(int harga) {
        return harga;
    }

    int hitungHarga(int harga, int jumlah) {
        return harga * jumlah;
    }

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga: " + harga);
    }
}