class KeretaEksekutif extends TiketKereta implements Fasilitas {

    KeretaEksekutif(String nama, String asal, String tujuan, int harga) {
        super(nama, asal, tujuan, harga);
    }

    @Override
    void infoKelas() {
        System.out.println("Kelas: Eksekutif");
    }

    @Override
    public void wifi() {
        System.out.println("Wifi: Ada");
    }

    @Override
    public void makanan() {
        System.out.println("Makanan: Termasuk");
    }
}