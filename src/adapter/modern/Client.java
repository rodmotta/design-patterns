package adapter.modern;

import adapter.common.AudioPlayer;

public class Client {
    public static void main(String[] args) {
        var mp3Player = new Mp3Player();
        AudioPlayer audioPlayer = fileName -> mp3Player.play(fileName);
        audioPlayer.play("song.mp3");

        var wavPlayer = new WavPlayer();
        audioPlayer = fileName -> wavPlayer.play(fileName);
        audioPlayer.play("song.wav");

        var flacPlayer = new FlacPlayer();
        audioPlayer = fileName -> flacPlayer.play(fileName);
        audioPlayer.play("song.flac");
    }
}
