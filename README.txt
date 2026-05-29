================================================
README - SISTEM PERPUSTAKAAN DIGITAL
PerpusDigital.java
==================

DESKRIPSI:
Program ini merupakan aplikasi Sistem Manajemen
Perpustakaan Digital berbasis Java CLI
(Command Line Interface).

Program digunakan untuk:

* Menambah data buku
* Menampilkan data buku
* Mengedit data buku
* Menghapus buku (soft delete)
* Mencari buku
* Mengurutkan data buku
* Mengubah status buku
* Menampilkan statistik perpustakaan
* Menyimpan data ke file CSV

---

## PERSYARATAN:

* Java Development Kit (JDK) versi 8 atau lebih baru
* Terminal / Command Prompt / IDE
  (IntelliJ IDEA, Eclipse, VS Code)

---

## CARA MENJALANKAN PROGRAM:

1. Kompilasi program:
   javac PerpusDigital.java

2. Jalankan program:
   java PerpusDigital

3. Ikuti menu yang tampil di layar:

   * Gunakan angka untuk memilih menu
   * Pilih 0 untuk keluar program

---

## MENU PROGRAM:

1. Tambah buku
2. Tampil semua
3. Edit buku
4. Hapus buku (soft delete)
5. Search buku
6. Urutkan buku
7. Update status buku
8. Statistik perpustakaan
9. Simpan data
10. Keluar

---

## FITUR PROGRAM:

1. Tambah Buku
   Menambahkan data buku baru ke sistem.

2. Tampil Semua
   Menampilkan seluruh data buku yang tersedia.

3. Edit Buku
   Mengubah data buku berdasarkan ID.

4. Hapus Buku
   Menggunakan metode soft delete
   sehingga data tidak benar-benar hilang.

5. Search Buku
   Pencarian berdasarkan:

   * ID
   * Nama
   * Kategori

6. Sorting Buku
   Pengurutan berdasarkan:

   * ID
   * Nama
   * Kategori

7. Update Status
   Mengubah status buku:

   * available
   * borrowed

8. Statistik
   Menampilkan:

   * Total buku
   * Buku tersedia
   * Buku dipinjam
   * Buku deleted

---

## ALGORITMA YANG DIGUNAKAN:

* Binary Search
* Linear Search
* Bubble Sort
* Selection Sort

---

## PENYIMPANAN DATA:

* Data disimpan dalam file:
  data_buku.csv

* File CSV akan dibuat otomatis
  saat memilih menu Simpan Data
  atau saat program keluar.

---

## STRUKTUR FILE:

PerpusDigital.java   → Source code utama
data_buku.csv        → File penyimpanan data
README.txt           → Dokumentasi program

---

## CATATAN:

* Data buku dengan status "deleted"
  tidak akan ditampilkan di menu utama.

* Sistem menggunakan ArrayList
  sebagai penyimpanan sementara di memori.

* Program menggunakan File I/O
  untuk membaca dan menyimpan data.

================================================
