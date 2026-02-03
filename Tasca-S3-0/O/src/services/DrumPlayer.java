package services;

import interfaces.InstrumentBehaviour;

public class DrumPlayer implements InstrumentBehaviour {
    @Override
    public void play() {
        System.out.println("🥁 Beating the drums");
    }
}
