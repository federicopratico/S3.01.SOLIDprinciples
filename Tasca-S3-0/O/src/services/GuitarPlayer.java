package services;

import interfaces.InstrumentBehaviour;

public class GuitarPlayer implements InstrumentBehaviour {
    @Override
    public void play() {
        System.out.println("🎸 Strumming the guitar");
    }
}
