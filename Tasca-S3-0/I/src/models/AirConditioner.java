package models;

import Interfaces.AirConditionerActions;

public class AirConditioner implements AirConditionerActions {

    @Override
    public void turnOn() {
        System.out.println("models.AirConditioner is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("models.AirConditioner is OFF");
    }

    @Override
    public void heat() {
        System.out.println("models.AirConditioner is heating.");
    }

    @Override
    public void cool() {
        System.out.println("models.AirConditioner is cooling.");
    }
}

