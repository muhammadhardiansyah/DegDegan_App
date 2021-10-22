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
public class DegDegan_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi jarak dan jumlah pasokan setiap kota
        Client Boyolali = new Client(15, 5000);
        Client Salatiga = new Client(35, 7500);
        Client Klaten = new Client(30, 8300);
        Client Kudus = new Client(75, 9100);
        
        //Instansiasi class Hitung
        Hitung hitung = new Hitung();
        
        //Hitung total Kelapa Muda yang perlu dipasok
        double totalKelapa = hitung.jumlah(Boyolali.jumlahBuah, Salatiga.jumlahBuah, Klaten.jumlahBuah, Kudus.jumlahBuah);
        System.out.println("Jumlah kelapa muda yang hendak dikirim : " + totalKelapa + " buah \n");
        
        //Hitung modal untuk beli kelapa muda
        double modalBeliKelapa = hitung.hargaTotal(totalKelapa);
        System.out.println("Modal untuk membeli kelapa muda dari petani : Rp. " + modalBeliKelapa + "\n");
        
        //Hitung berat kelapa muda setiap daerah.
        double beratDegan_Boyolali = hitung.beratTotal(Boyolali.jumlahBuah);
        double beratDegan_Salatiga = hitung.beratTotal(Salatiga.jumlahBuah);
        double beratDegan_Klaten = hitung.beratTotal(Klaten.jumlahBuah);
        double beratDegan_Kudus = hitung.beratTotal(Kudus.jumlahBuah);
        System.out.println("Total berat kelapa muda yang hendak dikirim ke beberapa daerah: ");
        System.out.println("-Boyolali : " + beratDegan_Boyolali + " kg.");
        System.out.println("-Salatiga : " + beratDegan_Salatiga + " kg.");
        System.out.println("-Klaten   : " + beratDegan_Klaten + " kg.");
        System.out.println("-Kudus    : " + beratDegan_Kudus + " kg. \n");
        
        
        //Karena setiap pengiriman hanya mampu memuat sampai 3000 kg,
        //Jadi kita hitung perlu berapa kali pengiriman
        int kirimBoyolali = hitung.jumlahKirim(beratDegan_Boyolali);
        int kirimSalatiga = hitung.jumlahKirim(beratDegan_Salatiga);
        int kirimKlaten = hitung.jumlahKirim(beratDegan_Klaten);
        int kirimKudus = hitung.jumlahKirim(beratDegan_Kudus);
        System.out.println("Karena dalam sekali antar, jasa kirim hanya mampu membawa 3000 kg. Maka kelapa muda akan dikirim : ");
        System.out.println("-Boyolali : " + kirimBoyolali + " kali");
        System.out.println("-Salatiga : " + kirimSalatiga + " kali");
        System.out.println("-Klaten   : " + kirimKlaten + " kali");
        System.out.println("-Kudus    : " + kirimKudus + " kali \n");
 
        //Hitung Biaya Pengiriman
        double JasaKeBoyolali = hitung.biayaKirim(Boyolali.jarak, kirimBoyolali);
        double JasaKeSalatiga = hitung.biayaKirim(Salatiga.jarak, kirimSalatiga);
        double JasaKeKlaten = hitung.biayaKirim(Klaten.jarak, kirimKlaten);
        double JasaKeKudus = hitung.biayaKirim(Kudus.jarak, kirimKudus);
        System.out.println("Biaya jasa kirim ke beberapa daerah : ");
        System.out.println("-Boyolali : Rp. " + JasaKeBoyolali );
        System.out.println("-Salatiga : Rp. " + JasaKeSalatiga );
        System.out.println("-Klaten   : Rp. " + JasaKeKlaten );
        System.out.println("-Kudus    : Rp. " + JasaKeKudus + "\n");
        
        //Hitung Total Biaya Jasa Kirim
        double totalBayarJasaKirim = hitung.jumlah(JasaKeBoyolali, JasaKeSalatiga, JasaKeKlaten, JasaKeKudus);
        System.out.println("Total Biaya Jasa Kirim : Rp. " + totalBayarJasaKirim + "\n");
        
        //Hitung Modal Total
        double modalTotal = hitung.jumlah(modalBeliKelapa, totalBayarJasaKirim) ;
        System.out.println("Modal Total : Rp. " + modalTotal + "\n");
        
        //Hitung jumlah penghasilan berupa jumlah modal ditambahkan keuntungan yang diinginkan
        double keuntungan = 15000000;
        double jumlahPenghasilan = hitung.jumlah(modalTotal, keuntungan);
        System.out.println("Penghasilan yang di inginkan : " + jumlahPenghasilan + "\n");
        
        //Hitung Harga minimal setiap buahnya untuk mencapai jumlah penghasilan yang di inginkan
        double hargaPerBuah = hitung.hargaPerBuah(jumlahPenghasilan, totalKelapa);
        System.out.println("Harga jual minimal per buah : Rp. " + hargaPerBuah + "\n");
        
        
        
        
    }   
}
