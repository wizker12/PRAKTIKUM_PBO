class TiketKereta {

    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    protected int harga;

    TiketKereta(String namaPenumpang, String asal, String tujuan, int harga) {
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    void tampilkanData() {
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga: " + harga);
    }
}