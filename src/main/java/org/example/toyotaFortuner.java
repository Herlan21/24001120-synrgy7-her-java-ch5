package org.example;

public class toyotaFortuner extends Car {
    private String model;

    public toyotaFortuner() {
        super(4, 80, "Manual");
        this.model = "Toyota Fortuner";
    }

    @Override
    public void moveForward() {
        System.out.println(model + " moves forward powerfully.");
    }

    @Override
    public void turn() {
        System.out.println(model + " turns with stability.");
    }

    public void offRoadDriving() {
        System.out.println(model + " is driving off-road.");
    }
    }

    // override metode moveForward dan turn untuk memberikan perilaku spesifik Toyota Fortuner
    // tambahkan metode offRoadDriving untuk Toyota Fortuner
