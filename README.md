# Sistem Peminjaman Buku Sederhana - Perpustakaan Ceria

Perpustakaan Ceria merupakan salah satu perpustakaan yang ramai di Gading Serpong. Namun, sistem peminjaman buku masih dilakukan secara manual, sehingga sering terjadi permohonan peminjaman yang terlewat dan keterlambatan pengembalian buku.

Untuk meningkatkan efisiensi proses peminjaman, dikembangkan sebuah program komputer sederhana yang dapat membantu proses pengelolaan katalog publikasi serta peminjaman dan pengembalian buku.

## 🎯 Tujuan

Menyediakan prototipe sistem peminjaman buku yang dapat digunakan untuk mengelola katalog dan transaksi peminjaman secara lebih terstruktur dan efisien.

## 📚 Fitur Utama

1. **Menampilkan Katalog Publikasi**  
   Menampilkan daftar semua publikasi dalam perpustakaan (buku dan artikel ilmiah) beserta detail informasi masing-masing.

2. **Menambahkan Publikasi Baru**  
   Menambahkan publikasi baru ke dalam katalog perpustakaan.

3. **Peminjaman Publikasi (Order)**  
   Melakukan proses peminjaman publikasi oleh pengguna.

4. **Manajemen Order dan Status Peminjaman**  
   Melihat dan mengubah status peminjaman setiap order yang ada.

## 🔄 Status Peminjaman

Setiap order peminjaman memiliki salah satu dari tiga status berikut:

- `Ongoing` – Peminjaman sedang berlangsung (default saat order dibuat).
- `Due` – Sudah melewati batas waktu peminjaman, namun belum dikembalikan.
- `Returned` – Publikasi telah dikembalikan.

## 🗃️ Struktur Data

- Program menggunakan data katalog dari file teks yang telah disediakan.
- Tidak diperlukan pembuatan data dummy tambahan.
- Desain program mengikuti diagram UML yang tersedia sebagai panduan pengembangan.

## ⚙️ Teknologi

- Bahasa Pemrograman: Java
- Tipe Aplikasi: Aplikasi konsol prototipe
- Format Data: File teks untuk katalog

---

Program ini dikembangkan sebagai solusi cepat untuk menghadapi lonjakan permintaan peminjaman buku dan artikel ilmiah, khususnya menjelang masa liburan sekolah.
