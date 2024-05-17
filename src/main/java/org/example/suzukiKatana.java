package org.example;

public class suzukiKatana extends Car {
    private String model;

    public suzukiKatana() {
        super(4, 50, "Manual");
        this.model = "Suzuki Katana";
    }

    @Override
    public void moveForward() {
        System.out.println(model + " moves forward with agility.");
    }

    @Override
    public void turn() {
        System.out.println(model + " turns sharply.");
    }

    public void openRoof() {
        System.out.println("Opening the roof of " + model);
    }
    }

    // override metode moveForward dan turn untuk memberikan perilaku spesifik Suzuki Katana
    // tambahkan metode openRoof untuk Suzuki Katana
