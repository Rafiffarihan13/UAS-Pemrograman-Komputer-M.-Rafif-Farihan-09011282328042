public class Buku {
    // Atribut buku
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;
    private String peminjam;

    // Konstruktor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
        this.peminjam = "Belum Dipinjam";
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul          : " + judul);
        System.out.println("Penulis        : " + penulis);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
        System.out.println("Status Peminjaman : " + (dipinjam ? "Sedang Dipinjam" : "Tersedia"));
        System.out.println("Peminjam       : " + peminjam);
        System.out.println();
    }

    // Metode untuk meminjam buku
    public void pinjamBuku(String namaPeminjam) {
        if (!dipinjam) {
            dipinjam = true;
            peminjam = namaPeminjam;
            System.out.println("Buku berhasil dipinjam oleh " + namaPeminjam + ".");
        } else {
            System.out.println("Buku sedang dipinjam oleh " + peminjam + ".");
        }
    }

    // Metode untuk mengembalikan buku
    public void kembalikanBuku() {
        if (dipinjam) {
            dipinjam = false;
            peminjam = "Belum Dipinjam";
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Buku sudah tersedia di perpustakaan.");
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        Buku buku1 = new Buku("Pengantar Membuat Robot", "M. Ibnu Malik", 2006);
        Buku buku2 = new Buku("Dunia Lebih Indah Tanpa Sekolah", "Nanang Martono", 2014);

        // Tampilkan informasi buku sebelum dipinjam
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        // Pinjam buku
        buku1.pinjamBuku("Rafif");
        buku2.pinjamBuku("Ilham");

        // Tampilkan informasi buku setelah dipinjam
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        // Kembalikan buku
        buku1.kembalikanBuku();
        buku2.kembalikanBuku();

        // Tampilkan informasi buku setelah dikembalikan
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
    }
}
