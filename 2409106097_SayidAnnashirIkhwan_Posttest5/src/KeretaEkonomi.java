class KeretaEkonomi extends TiketKereta implements Fasilitas {

    KeretaEkonomi(String nama, String asal, String tujuan, int harga) {
        super(nama, asal, tujuan, harga);
    }

    @Override
    void infoKelas() {
        System.out.println("Kelas: Ekonomi");
    }

    @Override
    public void wifi() {
        System.out.println("Wifi: Tidak ada");
    }

    @Override
    public void makanan() {
        System.out.println("Makanan: Tidak termasuk");
    }
}