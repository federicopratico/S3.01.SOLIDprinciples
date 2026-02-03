package models;

import Interfaces.WashingMachineActions;

public class WashingMachine implements WashingMachineActions {

    @Override
    public void turnOn() {
        System.out.println("models.WashingMachine is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("models.WashingMachine is OFF");
    }

    @Override
    public void wash() {
        System.out.println("models.WashingMachine is washing clothes.");
    }
}
