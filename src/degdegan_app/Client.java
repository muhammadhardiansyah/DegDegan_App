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
public class Client {
    double jumlahBuah;
    double jarak;
    
    Client(double jarak, double jumlahBuah){
        this.jumlahBuah = jumlahBuah;
        this.jarak = jarak;
    }
    Client(double jarak, int jumlahBuah){
        this.jumlahBuah = jumlahBuah;
        this.jarak = jarak;
    }
    Client(int jarak, double jumlahBuah){
        this.jumlahBuah = jumlahBuah;
        this.jarak = jarak;
    }
    Client(int jarak, int jumlahBuah){
        this.jumlahBuah = jumlahBuah;
        this.jarak = jarak;
    }
}
