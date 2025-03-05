package adapter.common;

public class WavAdapter implements AudioPlayer {
    private WavPlayer wavPlayer;

    public WavAdapter(WavPlayer wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    @Override
    public void play(String fileName) {
        wavPlayer.play(fileName);
    }
}
