# JOBSHEET 14

# Percobaan 3

Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”! 
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3) 




Jawaban
1. Base case:  

if (tahun == 0) { 

return (saldo); 

} 

Ini menghentikan rekursi saat tahun = 0. 

Recursion call:  

return (1.11 * hitungLaba(saldo, tahun - 1)); 

Ini memanggil fungsi hitungLaba secara rekursif.  

2. 🔹 Fase Ekspansi (pemanggilan rekursif)

Pada fase ini fungsi terus memanggil dirinya sendiri hingga mencapai kondisi berhenti (tahun == 0):

hitungLaba(100000, 3)
→ 1.11 × hitungLaba(100000, 2)

hitungLaba(100000, 2)
→ 1.11 × hitungLaba(100000, 1)

hitungLaba(100000, 1)
→ 1.11 × hitungLaba(100000, 0)

hitungLaba(100000, 0)
→ mengembalikan 100000 (base case)

🔹 Fase Substitusi (pengembalian nilai)

Pada fase ini nilai dikembalikan dari pemanggilan terdalam ke atas sambil dikalikan 1.11:

hitungLaba(100000, 0) = 100000

hitungLaba(100000, 1) = 1.11 × 100000 = 111000

hitungLaba(100000, 2) = 1.11 × 111000 = 123210

hitungLaba(100000, 3) = 1.11 × 123210 = 136763.1