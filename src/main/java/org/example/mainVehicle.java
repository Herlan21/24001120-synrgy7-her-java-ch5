package org.example;

public class mainVehicle {
    public static void main(String[] args) {
        hondaJazz jazz = new hondaJazz();
        toyotaFortuner fortuner = new toyotaFortuner();
        suzukiKatana katana = new suzukiKatana();

        jazz.moveForward();
        jazz.turn();

        fortuner.moveForward();
        fortuner.turn();
        fortuner.offRoadDriving();

        katana.moveForward();
        katana.turn();
        katana.openRoof();
    }
}
