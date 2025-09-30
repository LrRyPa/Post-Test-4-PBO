# Post Test 4 Sistem Manajemen Reservasi Hotel
Nama : Larry Polin Anugrah

NIM : 2409116026

Kelas : A

## Abstract Class
<img width="500" height="48" alt="image" src="https://github.com/user-attachments/assets/7db69cae-535a-4e60-a1a3-21d864b5e770" />

Class  abstract **promo** pada packages model dibuat untuk kerangka dasar dari sebuah promo. Dalam class tersebut terdapat method hitungPotongan() tanpa memiliki isi (body). Sehingga class ini hanya dapat mewariskannya saja ke subclass **promoMenginap**

### Implementasinya Pada Class promoMenginap
<img width="557" height="97" alt="image" src="https://github.com/user-attachments/assets/a6a46a09-7638-4a50-b259-93d518b7a34d" />

Pada class promoMenginap, method hitungPotongan()  di**override** dari abstract class untuk menuliskan sebuah perhitungan potongan harga. Perhitungan potongan harga  dilakukan dengan cara mengalikan total harga dengan persentase diskon (**persen/100**), lalu hasilnya dikurangi dari total. Dengan adanya override pada method ini, subclass promoMenginap dapat menjalankan perhitungan diskon sesuai kebijakan promo menginap.

## Interface Class
<img width="509" height="49" alt="image" src="https://github.com/user-attachments/assets/a717274b-04c2-453d-9f70-83497409ec9d" />

Class interface **kondisiPromo** pada packages model dibuat untuk menjadi sebuah kontrak yang mengharuskan setiap class yang menggunakannya wajib menulis sendiri cara kerja cekKondisi(). 

### Implementasinya pada Class promoMenginap
<img width="527" height="92" alt="image" src="https://github.com/user-attachments/assets/c9b6ada7-0572-4a31-a5ca-0df8d7f43c41" />

Pada class promoMenginap, method cekKondisi() di**override** dari interface kondisiPromo untuk menentukan apakah sebuah reservasi memenuhi syarat promo, pengecekkan dilakukan dengan mengecek apakah malam (lama menginap) melebihi syarat yang telah ditentukan.


## Subclass Abstract promoMenginap
<img width="503" height="85" alt="image" src="https://github.com/user-attachments/assets/eca31d1d-bae2-4946-90d6-ab10aeaffbb4" />

Subclass abstract **promoMenginap** pada packages model dibuat untuk mengatur kondisi promo khusus berdasarkan lama menginap tamu di hotel. Pada parameter constructor promoMenginap, nilai pada persen dan minMalam telah ditentukan dengan ketentuan (10, 5). Sehingga nilai persen/potongan yang didapat akan 10% dan jumlah minimal malamnya >= 5 malam.

<img width="722" height="468" alt="image" src="https://github.com/user-attachments/assets/d95e5cc1-4041-46b0-96cb-7e6180714e20" />

Class ini memanggil/menggunakan abstract class **promo** dan interface class **kondisiPromo**,sehingga memiliki tugas untuk memastikan bahwa promo hanya bisa diterapkan jika jumlah malam (lama menginap) memenuhi syarat minimal yang sudah ditentukan, melalui method cekKondisi(). Selain itu, class ini juga menimpa method hitungPotongan() dari superclass promo agar perhitungan total tarif bisa langsung dikurangi sesuai dengan persentase diskon yang telah ditetapkan.

### Penerapan Overloading
<img width="976" height="402" alt="image" src="https://github.com/user-attachments/assets/2f72d33b-974e-49b0-89c6-b3db775407eb" />

Pada class reservasiService, terdapat dua method tambahReservasi yang memiliki jumlah parameter yang berbeda. Pada method pertama menggunakan tiga parameter (String nama, Kamar kamar, int malam) yang memungkin program untuk menambah reservasi tanpa promo, sedangkan pada method kedua menggunakan empat parameneter(String nama, Kamar kamar, int malam, promo prm) yang memungkin program untuk menambah reservasi dengan memberikan promo berupa potongan harga.

### Penerapan Overriding
<img width="519" height="202" alt="image" src="https://github.com/user-attachments/assets/e3ac20b2-660e-48b5-a1c4-568cd024a7b1" />

Pada class promoMenginap, terdapat **overrde** yang memungkinkan subclass ini memberikan implementasi khusus terhadap method yang diwariskan. Method cekKondisi() dioverride dari interface kondisiPromo untuk memeriksa apakah jumlah malam menginap sudah memenuhi syarat minimal (minMalam), sedangkan method hitungPotongan() dioverride dari abstract class promo untuk menghitung besarnya potongan harga berdasarkan persentase diskon (persen)

## Output Program
### Tambah Reservasi 
#### Tambah Reservasi dengan lama menginap < 5 malam.
* Saat Tambah Reservasi
<img width="389" height="105" alt="image" src="https://github.com/user-attachments/assets/4f24adfa-e3a9-4038-90a1-3ab78d36b71c" />

* Sesudah Tambah Reservasi
<img width="324" height="121" alt="image" src="https://github.com/user-attachments/assets/61123a16-9fcb-4e55-bf08-2d51b47b9047" />

Ketika menambahkan reservasi yang lama menginap (malam) kurang dari lima, maka tarif akan ditetapkan tanpa potongan dari promoMenginap. Sehingga tarif yang diperolah sebesar Rp 1.000.000 (tarif tipe kamar * malam)

#### Tambah Reservasi dengan lama menginap >= 5 malam.
* Saat Tambah Reservasi
<img width="396" height="109" alt="image" src="https://github.com/user-attachments/assets/c3f65593-0dc5-498a-999e-3418fc34a6eb" />

* Sesudah Tambah Reservasi
<img width="330" height="132" alt="image" src="https://github.com/user-attachments/assets/1cea9151-da38-4d8c-932c-79eb37fc6bf8" />

Ketika menambahkan reservasi yang lama menginap (malam) lebih dari sama dengan lima, maka tarif akan mendapatkan potongan sebesar 10% dari promoMenginap. Tarif semula yang harusnya Rp 1.250.000 mendapatkan potongan sebesar Rp 125.000, sehingga diperoleh tarif sebesar Rp 1.125.000 (total tarif - (total tarif * 10/100). 
