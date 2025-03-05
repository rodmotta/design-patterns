package adapter.common;

public class Client {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new Mp3Player();
        mp3Player.play("song.mp3");

        AudioPlayer wavPlayer = new WavAdapter(new WavPlayer());
        wavPlayer.play("song.wav");

        AudioPlayer flacAdapter = new FlacAdapter(new FlacPlayer());
        flacAdapter.play("song.flac");
    }
}
