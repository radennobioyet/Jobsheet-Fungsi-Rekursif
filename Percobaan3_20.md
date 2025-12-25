# JOBSHEET 14

# Percobaan 3

Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”! 




Jawaban
1. Base case:  

if (tahun == 0) { 
return (saldo); 
} 

Ini menghentikan rekursi saat tahun = 0. 

Recursion call:  

return (1.11 * hitungLaba(saldo, tahun - 1)); 

Ini memanggil fungsi hitungLaba secara rekursif.  