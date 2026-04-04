class KeretaEkonomi extends TiketKereta {

    KeretaEkonomi(String nama, String asal, String tujuan, int harga) {
        super(nama, asal, tujuan, harga);
    }

    void infoKelas() {
        System.out.println("Kelas: Ekonomi");
    }
}