package org.example;

public class hondaJazz extends Car {
    private String model; // atribut untuk model mobil

    public hondaJazz() {
        super(4, 40, "Automatic"); // memanggil konstruktor superclass dengan jumlah roda, kapasitas tangki, dan tipe transmisi
        this.model = "Honda Jazz"; // inisialisasi atribut model
    }


    // override metode moveForward dan turn untuk memberikan perilaku spesifik Honda Jazz
    // tambahkan metode playMusic untuk Honda Jazz
}
