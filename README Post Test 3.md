# Sistem Manajemen Reservasi Hotel
Nama : Larry Polin Anugrah

NIM : 2409116026

Kelas : A

## Struktur Packages Model
<img width="485" height="137" alt="image" src="https://github.com/user-attachments/assets/a60ecf55-b0b7-4640-b0f1-592c0d5042fe" />

packages ini terdiri dari beberapa class seperti reservasiModel, Kamar (Superclass), kamarStandard (Subclass), kamarDeluxe (Subclass), kamarSuite (Subclass)

#### 1. Class Kamar (Superclass)
Class Kamar merupakan superclass yang menjadi _blueprint_ bagi semua jenis kamar hotel. Kelas ini menyimpan atribut namaTipe dengan akses private, lalu menyediakan konstruktor untuk menginisialisasi tipe kamar serta method getNamaTipe() dan getTarif(). 
* Method getNamaTipe() akan mengembalikan nilai atribut namaTipe yang disimpan secara private di dalam class ini.
* Method getTarif() bernilai default 0 dan akan dioverride oleh subclass agar masing-masing tipe kamar (Standard, Deluxe, Suite) dapat menentukan tarif per malamnya sendiri

#### 2. Class kamarStandard (Subclass)
Class kamarStandard adalah turunan dari class Kamar yang dikhususkan untuk kamar bertipe Standard. Saat objeknya dibuat, constructor secara otomatis memanggil super("STANDARD") supaya atribut namaTipe langsung berisi “STANDARD”. Di dalamnya juga ada method getTarif() yang melakukan overriding untuk menetapkan tarif tetap sebesar Rp 250.000 per malam.

#### 3. Class kamarDeluxe (Subclass)
Class kamarDeluxe adalah turunan dari class Kamar yang dikhususkan untuk kamar bertipe Deluxe. Saat objeknya dibuat, constructor secara otomatis memanggil super("DELUXE") supaya atribut namaTipe langsung berisi “DELUXE”. Di dalamnya juga ada method getTarif() yang melakukan overriding untuk menetapkan tarif tetap sebesar Rp 400.000 per malam.

#### 4. Class kamarSuite (Subclass)
Class KamarSuite adalah turunan dari class Kamar yang dikhususkan untuk kamar bertipe Suite. Saat objeknya dibuat, constructor secara otomatis memanggil super("SUITE") supaya atribut namaTipe langsung berisi “SUITE”. Di dalamnya juga ada method getTarif() yang melakukan overriding untuk menetapkan tarif tetap sebesar Rp 750.000 per malam.

## Alur Program
### Tambah Reservasi
<img width="407" height="154" alt="image" src="https://github.com/user-attachments/assets/42e3be5a-86da-4bb5-9f9f-72a725e76515" />

Saat pengguna menambah data reservasi, program akan memanggil method inputTipe() lebih dulu untuk memeriksa dan memastikan pilihan tipe kamar yang dimasukkan memang sesuai, yaitu Standard, Deluxe, atau Suite. Setelah lolos pengecekan, method ini langsung membuat dan mengembalikan objek kamar yang pas, seperti KamarStandard, KamarDeluxe, atau KamarSuite yang semuanya turunan dari class Kamar. Dengan cara ini, setiap objek kamar yang dipakai di data reservasi sudah punya nama tipe dan tarif per malam yang tepat sejak awal, sehingga proses perhitungan biaya dan penyimpanannya jadi lebih rapi.

### Perbarui Tipe Kamar Standard
* Sebelum Diperbarui
<img width="428" height="325" alt="image" src="https://github.com/user-attachments/assets/9ee3f78a-93ad-4ca2-8362-d38497898f91" />

* Saat Diperbarui
<img width="409" height="263" alt="image" src="https://github.com/user-attachments/assets/0da50222-5d94-4c83-92fe-825c62b3e8c3" />

* Sesudah Diperbarui
<img width="377" height="156" alt="image" src="https://github.com/user-attachments/assets/0ea49cc8-65b7-4054-af29-44a32998c0c7" />

Setelah program menemukan pilihan tipe kamar yang sesuai, seperti “Suite”. Program langsung mengubah nilai tipe kamar pada data reservasi menjadi "SUITE" dan sekaligus mengubah tarifnya menjadi Rp 750.000 per malam, lalu melakukan perhitungan kembali (tarif * malam) sehingga total biaya menginap menjadi Rp 3.750.000.

### Perbarui Tipe Kamar Deluxe
* Sebelum Diperbarui
<img width="436" height="322" alt="image" src="https://github.com/user-attachments/assets/2dd4166e-7468-4876-809b-7137a8a9290a" />

* Saat Diperbarui
<img width="437" height="264" alt="image" src="https://github.com/user-attachments/assets/c845feb4-6f32-4251-977d-318179261800" />

* Sesudah Diperbarui
<img width="372" height="137" alt="image" src="https://github.com/user-attachments/assets/6a01953a-390f-4bf1-a630-ac0219290ed7" />

Setelah program menemukan pilihan tipe kamar yang sesuai, seperti “Standard”. Program langsung mengubah nilai tipe kamar pada data reservasi menjadi "STANDARD" dan sekaligus mengubah tarifnya menjadi Rp 250.000 per malam, lalu melakukan perhitungan kembali (tarif * malam) sehingga total biaya menginap menjadi Rp 1.250.000.

### Perbarui Tipe Kamar Suite
* Sebelum Diperbarui
<img width="440" height="321" alt="image" src="https://github.com/user-attachments/assets/3ef4c3c7-9dbb-4e02-90e2-86097d7a023f" />

* Saat Diperbarui
<img width="419" height="267" alt="image" src="https://github.com/user-attachments/assets/fe2a9498-ab15-4ba4-ab39-599fb696e8fc" />

* Sesudah Diperbarui
<img width="394" height="137" alt="image" src="https://github.com/user-attachments/assets/76122bfa-473f-496e-bf42-d33f13392be2" />

Setelah program menemukan pilihan tipe kamar yang sesuai, seperti “Deluxe”. Program langsung mengubah nilai tipe kamar pada data reservasi menjadi "DELUXE" dan sekaligus mengubah tarifnya menjadi Rp 400.000 per malam, lalu melakukan perhitungan kembali (tarif * malam) sehingga total biaya menginap menjadi Rp 400.000.



