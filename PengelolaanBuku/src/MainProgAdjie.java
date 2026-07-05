import java.util.ArrayList;
import java.util.Scanner;

public class MainProgAdjie {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
         ArrayList<BukuAdjie> daftarBuku = new ArrayList<>();
        int pilihan;

        do { 
            System.out.println("\n=== PROGRAM PENGELOLAAN BUKU ===");
            System.out.println("1. Tambah Data Buku");
            System.out.println("2. Tampilkan Semua Data Buku");
            System.out.println("3. Ubah Data Buku");
            System.out.println("4. Hapus Data Buku");
            System.out.println("5. Keluar Dari Program");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 :
                    System.out.print("Masukkan Judul Buku : ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Nama Penulis : ");
                    String penulis = input.nextLine();
                    System.out.print("Masukkan Kategori Buku : ");
                    String kategori = input.nextLine();
                    System.out.print("Masukkan Nama Penerbit : ");
                    String penerbit = input.nextLine();
                    System.out.print("Masukkan Tahun Terbit : ");
                    int tahunTerbit = input.nextInt();
                    daftarBuku.add(new BukuAdjie(judul, penulis, kategori, penerbit, tahunTerbit));
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                
                case 2 :
                    System.out.println("\n--- DATA SELURUH BUKU ---");
                    for (int i = 0; i < daftarBuku.size(); i++) {
                        BukuAdjie m = daftarBuku.get(i);
                        System.out.println((i+1) + ". Judul Buku: " + m.getJudul() + "\nPenulis: " + m.getPenulis() + "\nKategori: " + m.getKategori() + "\nPenerbit: " + m.getPenerbit() + "\nTahun Terbit: " + m.gettahunTerbit() + "\n");
                    }
                    break;

                case 3 :
                    System.out.print("Masukkan nomor urut buku yang ingin diubah: ");
                    int indexUbah = input.nextInt() - 1;
                    input.nextLine();
                    if (indexUbah >= 0 && indexUbah < daftarBuku.size()) {
                        System.out.print("Masukkan Judul Buku: ");
                        String judulBaru = input.nextLine();
                        daftarBuku.get(indexUbah).setJudul(judulBaru);
                        
                        System.out.print("Masukkan Penulis Buku: ");
                        String penulisBaru = input.nextLine();
                        daftarBuku.get(indexUbah).setPenulis(penulisBaru);

                        System.out.print("Masukkan Kategori Buku: ");
                        String kategoriBaru = input.nextLine();
                         daftarBuku.get(indexUbah).setKategori(kategoriBaru);

                        System.out.print("Masukkan Penerbit Buku: ");
                        String penerbitBaru = input.nextLine();
                        daftarBuku.get(indexUbah).setPenerbit(penerbitBaru);

                        System.out.print("Masukkan tahun Terbit Buku: ");
                        int tahunTerbitBaru = input.nextInt();
                        daftarBuku.get(indexUbah).settahunTerbit(tahunTerbitBaru);

                        System.out.println("\n[Sukses] Data buku pada urutan ke- " + (indexUbah + 1) + " berhasil diperbarui!");

                    } else {
                        System.out.println("Nomor urut tidak ditemukan!");
                    }
                    break;

                case 4 :
                    System.out.print("Masukkan nomor urut buku yang ingin dihapus: ");
                    int indexHapus = input.nextInt() - 1;
                    if (indexHapus >= 0 && indexHapus < daftarBuku.size()) {
                        daftarBuku.remove(indexHapus);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Nomor urut tidak ditemukan!");
                    }
                    break;

                case 5 :
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!");
            }

        } while (pilihan != 5);

        // System.out.println("------ Program Perpustakaan Sederhana -----\n");

        // BukuAdjie buku1 = new BukuAdjie("Belajar Pemrograman Java", "Dr. Umar Bakri", "Teknologi", "Gramedia",2025);
        // BukuAdjie buku2 = new BukuAdjie("Panduan Lengkap JavaFX", "Pro Dr. Tantra", "Teknologi", "Gramedia", 2022);

        // System.out.println("\nCek Judul Buku 1: " + buku1.getJudul() +"\nNama Penulis Buku 1: " + buku1.getPenulis() + "\nKategori Buku 1: " + buku1.getKategori() + "\nPenerbit Buku 1: " + buku1.getPenerbit() + "\nTahun terbit buku 1: " + buku1.gettahunTerbit());

        //  System.out.println("\nCek Judul Buku 2: " + buku1.getJudul() +"\nNama Penulis Buku 2: " + buku1.getPenulis() + "\nKategori Buku 2: " + buku1.getKategori() + "\nPenerbit Buku 2: " + buku1.getPenerbit() + "\nTahun terbit buku 2: " + buku1.gettahunTerbit());
    }
}
