package adapterPattern;

/**
 * Created by arpit on 4/2/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing " + fileName + " in VLC Player....");
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing " + fileName + " in MP4 Player....");
    }
}
