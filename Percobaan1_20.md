# JOBSHEET 14

# Percobaan 1

Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif? 
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif! 




Jawaban 
1. Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri di dalam proses eksekusinya untuk menyelesaikan suatu masalah secara bertahap.
2. fungsi faktorialRekursif() dan faktorialIteratif() menghasilkan nilai yang sama, yaitu 120 untuk input 5, karena keduanya menghitung faktorial dengan rumus yang sama. Perbedaannya terletak pada alur eksekusi program, di mana fungsi rekursif bekerja dengan cara memanggil dirinya sendiri secara berulang dari nilai 5 hingga mencapai kondisi berhenti saat n == 1, kemudian hasil perhitungan dikembalikan secara bertahap ke pemanggilan sebelumnya, sedangkan fungsi iteratif menghitung faktorial menggunakan perulangan for dalam satu alur eksekusi tanpa pemanggilan fungsi berulang, sehingga prosesnya berjalan langsung dari 5 hingga 1 dan lebih efisien dalam penggunaan memori.