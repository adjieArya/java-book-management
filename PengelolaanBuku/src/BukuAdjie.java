public class BukuAdjie {
  private String judul, penulis, kategori, penerbit;
  private int tahunTerbit;

     public BukuAdjie(String judul, String penulis,String kategori, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        System.out.println("Buku berhasil ditambahkan: " + this.judul);
    }

    //Getters
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int gettahunTerbit() {
        return tahunTerbit;
    }

    //Setters
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void settahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }


}