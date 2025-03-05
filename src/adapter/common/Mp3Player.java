package adapter.common;

public class Mp3Player implements AudioPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}
