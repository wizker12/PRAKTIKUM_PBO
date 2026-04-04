class KeretaEksekutif extends TiketKereta {

    KeretaEksekutif(String nama, String asal, String tujuan, int harga) {
        super(nama, asal, tujuan, harga);
    }

    void infoKelas() {
        System.out.println("Kelas: Eksekutif");
    }
}