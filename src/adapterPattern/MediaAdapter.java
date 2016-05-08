package adapterPattern;

/**
 * Created by arpit on 4/2/16.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType, String fileName) {
        play(audioType, fileName);
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            startVLCMediaPlayer(fileName);
        else if(audioType.equalsIgnoreCase("mp4"))
            startMp4MediaPlayer(fileName);
    }

    private void startVLCMediaPlayer(String fileName){
        advancedMediaPlayer = new VlcPlayer();
        advancedMediaPlayer.playVLC(fileName);
    }

    private void startMp4MediaPlayer(String fileName) {
        advancedMediaPlayer = new Mp4Player();
        advancedMediaPlayer.playMP4(fileName);
    }
}
