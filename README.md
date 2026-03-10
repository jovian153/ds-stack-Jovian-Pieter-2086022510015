1. How to compile/run each question?
   cara compilenya yaitu dengan membuka terminal kemudian mengetik "javac <namafile>.java"
   kemudian cara run file javanya yaitu mengetik "java <namafile>"

2. Input format + example usage
   Soal 1: Bracket Checker
   Input Format: String yang berisi kombinasi kurung `()`, `{}`, dan `[]`.
   Example: 
   Input: `{[([)]]}` -> Output: `Tidak seimbang`
   Input: `({[]})` -> Output: `Seimbang`

   Soal 2: RPN Evaluator
   Input Format: Angka dan operator matematika `+`, `-`, `*`, `/` dipisahkan oleh spasi.
   Example: Input: `2 1 + 3 *` -> Output: `9`

   Soal 3: Chrono Stack Engine
   Input Format: Baris pertama berisi jumlah angka (N). Baris kedua berisi N buah angka.
   Example:
   Input: 
    `5`
    `1 5 6 3 2`
   Output: `1d+1+d+d+1d+1+d+d+1d+d+d+1+1d+d+1d+`

   Soal 4: Cheat Buster Security System
   Input Format: Deretan angka acak yang dipisahkan oleh spasi.
   Example: 
   Input: `42 9 17 63 28 5 74`
   Output: `5 9 17 28 42 63 74`

   Soal 5: Operation Chastise**
   Input Format: Satu buah angka bilangan bulat (Momentum bom).
   Example: 
   Input: `50`
   Output: `1 3 6 12 25 50`

3. Any assumptions and edge cases
   Soal 1: Jika input berupa string kosong (tidak ada karakter yang dimasukkan), program mengasumsikannya sebagai kondisi "Seimbang/Valid".
   Soal 2: Pembagian angka ganjil akan menghasilkan pemotongan desimal ke arah nol (Truncate toward zero), karena diatasi secara natural oleh tipe data primitif `int` pada Java.
   Soal 3: Program mengasumsikan input angka selalu di atas 0, dan memanfaatkan konversi Biner logaritmik untuk meracik kompensasi distorsi waktu dengan aman.
   Soal 4: Logika `Bubble Sort` manual aman dari error meskipun input mengandung angka negatif, angka nol, atau angka kembar berulang.
   Soal 5: Pembagian momentum yang menyisakan angka desimal akan otomatis dibulatkan (dibuang desimalnya) menggunakan sifat bawaan operasi bilangan bulat di Java.


Assignment Report
[Assignment Report](/Report/Stack_Assignment_Report_Jovian_Pieter_2086022510015.pdf)