package services;

import interfaces.Instrument;

public class PianoPlayer implements Instrument {
    @Override
    public void play() {
        System.out.println("🎹 Playing the piano");
    }
}
