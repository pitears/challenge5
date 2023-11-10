package org.example;

import org.junit.Test;

public class vehicleTest {
    @Test
    public static void main(String[] args) {
        HondaJazz hondaJazz = new HondaJazz(5, 60, "Jazz RS");
        ToyotaFortuner toyotaFortuner = new ToyotaFortuner(5, 100, true);
        SuzukiKatana suzukiKatana = new SuzukiKatana(3, 40, false);

        System.out.println("--- Honda Jazz ---");
        hondaJazz.moveForward();
        hondaJazz.turn();
        hondaJazz.shiftGear();
        hondaJazz.playMusic();
        System.out.println();

        System.out.println("--- Toyota Fortuner ---");
        toyotaFortuner.moveForward();
        toyotaFortuner.turn();
        toyotaFortuner.shiftGear();
        System.out.println();

        System.out.println("--- Suzuki Katana ---");
        suzukiKatana.moveForward();
        suzukiKatana.turn();
        suzukiKatana.shiftGear();
    }
}
