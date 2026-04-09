class KeretaEkonomi extends TiketKereta {

    KeretaEkonomi(String nama, String asal, String tujuan, int harga) {
        super(nama, asal, tujuan, harga);
    }

    @Override
    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Kelas: Ekonomi");
    }
}