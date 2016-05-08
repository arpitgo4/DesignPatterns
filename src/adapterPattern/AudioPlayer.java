package adapterPattern;

/**
 * Created by arpit on 4/2/16.
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing " + fileName + " file in Mp3 Player....");
        else new MediaAdapter(audioType, fileName);
    }

}
