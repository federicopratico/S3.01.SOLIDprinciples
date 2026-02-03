import interfaces.Instrument;
import services.DrumPlayer;
import services.GuitarPlayer;
import services.PianoPlayer;

public class InstrumentPlayer {
    public void play(Instrument instrument) {
        instrument.play();
    }

    public static void main(String[] args) {
        InstrumentPlayer player = new InstrumentPlayer();
        player.play(new GuitarPlayer());
        player.play(new DrumPlayer());
        player.play(new PianoPlayer());
    }
}
