package services;

import interfaces.InstrumentBehaviour;

public class PianoPlayer implements InstrumentBehaviour {
    @Override
    public void play() {
        System.out.println("🎹 Playing the piano");
    }
}
