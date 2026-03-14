class TiketKereta {

    private String namaPenumpang;
    private String asal;
    private String tujuan;
    private int harga;

    TiketKereta(String namaPenumpang, String asal, String tujuan, int harga) {
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga >= 0) {
            this.harga = harga;
        }
    }

    void tampilkanData() {
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Asal           : " + asal);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Harga Tiket    : " + harga);
        System.out.println("-----------------------------");
    }
}