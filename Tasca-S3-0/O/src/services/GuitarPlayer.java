package services;

import interfaces.Instrument;

public class GuitarPlayer implements Instrument {
    @Override
    public void play() {
        System.out.println("🎸 Strumming the guitar");
    }
}
