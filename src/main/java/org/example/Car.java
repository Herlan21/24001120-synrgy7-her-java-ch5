package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car extends Vehicle{
    private int fuelTankCapacity;
    private String transmissionType;

    public Car(int wheels, int fuelTankCapacity, String transmissionType) {
        super(wheels);
        this.fuelTankCapacity = fuelTankCapacity;
        this.transmissionType = transmissionType;
    }

    public void changeTransmission(String newTransmissionType) {
        this.transmissionType = newTransmissionType;
        System.out.println("Transmission changed to: " + newTransmissionType);
    }

    @Override
    public void moveForward() {
        System.out.println("The car moves forward.");
    }

    @Override
    public void turn() {
        System.out.println("The car turns.");
    }
}
