package services;

import interfaces.Instrument;

public class DrumPlayer implements Instrument {
    @Override
    public void play() {
        System.out.println("🥁 Beating the drums");
    }
}
