class TiketKereta {

    String namaPenumpang;
    String asal;
    String tujuan;
    int harga;

    TiketKereta(String namaPenumpang, String asal, String tujuan, int harga) {
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    void tampilkanData() {
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Asal           : " + asal);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Harga Tiket    : " + harga);
        System.out.println("---------------------------");
    }
}