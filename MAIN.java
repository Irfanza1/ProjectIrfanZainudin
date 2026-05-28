import java.util.Scanner;

record Buku(String kode, String judul, String penulis, int tahun, boolean tersedia) {}

public class SistemPerpustakaanUTS {

    static Buku[] daftarBuku = new Buku[100];
    static int jumlahBuku = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM DATA BUKU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Kode Buku");
            System.out.println("4. Tampilkan Semua Buku dengan status Tersedia");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahBuku(input);
                    break;

                case 2:
                    tampilkanSemua();
                    break;

                case 3:
                    cariBuku(input);
                    break;

                case 4:
                    tampilkanTersedia();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }

    static void tambahBuku(Scanner input) {
        System.out.print("Kode Buku: ");
        String kode = input.nextLine();

        System.out.print("Judul: ");
        String judul = input.nextLine();

        System.out.print("Penulis: ");
        String penulis = input.nextLine();

        System.out.print("Tahun: ");
        int tahun = input.nextInt();
        input.nextLine();

        daftarBuku[jumlahBuku] = new Buku(kode, judul, penulis, tahun, true);
        jumlahBuku++;

        System.out.println("Buku berhasil ditambahkan!");
    }

    static void tampilkanSemua() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada data buku.");
            return;
        }

        for (int i = 0; i < jumlahBuku; i++) {
            Buku b = daftarBuku[i];
            System.out.println(
                b.kode() + " | " +
                b.judul() + " | " +
                b.penulis() + " | " +
                b.tahun() + " | " +
                (b.tersedia() ? "Tersedia" : "Dipinjam")
            );
        }
    }

    static void cariBuku(Scanner input) {
        System.out.print("Masukkan kode buku: ");
        String kode = input.nextLine();

        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].kode().equalsIgnoreCase(kode)) {

                Buku b = daftarBuku[i];

                System.out.println("Buku ditemukan:");
                System.out.println(
                    b.kode() + " | " +
                    b.judul() + " | " +
                    b.penulis() + " | " +
                    b.tahun() + " | " +
                    (b.tersedia() ? "Tersedia" : "Dipinjam")
                );
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    static void tampilkanTersedia() {

        boolean ada = false;

        for (int i = 0; i < jumlahBuku; i++) {

            if (daftarBuku[i].tersedia()) {
                System.out.println(
                    daftarBuku[i].kode() + " - " + daftarBuku[i].judul()
                );
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada buku yang tersedia.");
        }
    }
}