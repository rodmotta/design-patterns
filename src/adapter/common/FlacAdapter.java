package adapter.common;

public class FlacAdapter implements AudioPlayer {
    private FlacPlayer flacPlayer;

    public FlacAdapter(FlacPlayer flacPlayer) {
        this.flacPlayer = flacPlayer;
    }

    @Override
    public void play(String fileName) {
        flacPlayer.play(fileName);
    }
}
