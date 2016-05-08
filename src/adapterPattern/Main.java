package adapterPattern;

/**
 * Created by arpit on 4/2/16.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Adapter Design Pattern");
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "Song Name");
        mediaPlayer.play("mp4", "Mp4 Movie Name");
        mediaPlayer.play("vlc", "Vlc Movie Name");
    }

}
