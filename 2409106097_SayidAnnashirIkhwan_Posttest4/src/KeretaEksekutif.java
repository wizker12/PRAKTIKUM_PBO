class KeretaEksekutif extends TiketKereta {

    KeretaEksekutif(String nama, String asal, String tujuan, int harga) {
        super(nama, asal, tujuan, harga);
    }

    @Override
    void tampilkanData() {
        super.tampilkanData();
        System.out.println("Kelas: Eksekutif");
    }
}