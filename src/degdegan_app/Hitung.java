/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdegan_app;

/**
 *
 * @author asus
 */
public class Hitung {
    //hitung jumlah buah dengan beberapa overloading
    double jumlah(double var1, double var2){
        return var1 + var2;
    }
    double jumlah(double var1, double var2, double var3){
        return var1 + var2 + var3;
    }
    double jumlah(double var1, double var2, double var3, double var4){
        return var1 + var2 + var3 + var4;
    }
    double jumlah(double var1, double var2, double var3, double var4, double var5){
        return var1 + var2 + var3 + var4 + var5;
    }
    
    //hitung modal untuk membeli kelapa muda
    static double harga = 8000;
    double hargaTotal(double jumlahBuah){
        return jumlahBuah * Hitung.harga;
    }
    double hargaTotal(int jumlahBuah){
        return jumlahBuah * Hitung.harga;
    }
    
    //hitung berat total kelapa
    static double berat_Gram = 1200;
    static double berat_Kg = Hitung.berat_Gram / 1000.;
    double beratTotal(double jumlahBuah){
        return Hitung.berat_Kg * jumlahBuah;
    }
    double beratTotal(int jumlahBuah){
        return Hitung.berat_Kg * jumlahBuah;
    }
    
    //hitung jumlah pengiriman
    static int beratMaksimum = 3000;
    int jumlahKirim (int jumlahBerat){
        int kirim = 0;
        if (jumlahBerat % Hitung.beratMaksimum == 0){
            kirim = jumlahBerat / Hitung.beratMaksimum;
        } else if (jumlahBerat % Hitung.beratMaksimum != 0){
            kirim = (jumlahBerat / Hitung.beratMaksimum) + 1; 
        }
        return kirim;
    }
    int jumlahKirim (double jumlahBerat){
        //di buat ineteger
        Double berat = jumlahBerat;
        Integer jumlahBrat = berat.intValue();
        int kirim = 0;
        if (jumlahBrat % Hitung.beratMaksimum == 0){
            kirim = jumlahBrat / Hitung.beratMaksimum;
        } else if (jumlahBrat % Hitung.beratMaksimum != 0){
            kirim = (jumlahBrat / Hitung.beratMaksimum) + 1; 
        }
        return kirim;
    }
    
    //hitung biaya pengiriman
    static double jasaKirim = 700000; //
    static double setiap = 5; //
    double biayaKirim(double jarak, double kirimBerapaKali){
        return ((jarak / Hitung.setiap) * Hitung.jasaKirim) * kirimBerapaKali;
    }
    double biayaKirim(double jarak, int kirimBerapaKali){
        return ((jarak / Hitung.setiap) * Hitung.jasaKirim) * kirimBerapaKali;
    }
    double biayaKirim(int jarak, double kirimBerapaKali){
        return ((jarak / Hitung.setiap) * Hitung.jasaKirim) * kirimBerapaKali;
    }
    double biayaKirim(int jarak, int kirimBerapaKali){
        return ((jarak / Hitung.setiap) * Hitung.jasaKirim) * kirimBerapaKali;
    }
    
    //Hitung Harga Per Buah
    double hargaPerBuah (double totalModal, double jumlahBuah){
        return totalModal / jumlahBuah;
    }
    double hargaPerBuah (double totalModal, int jumlahBuah){
        return totalModal / jumlahBuah;
    }
    double hargaPerBuah (int totalModal, double jumlahBuah){
        return totalModal / jumlahBuah;
    }
    int hargaPerBuah (int totalModal, int jumlahBuah){
        return totalModal / jumlahBuah;
    }
}
