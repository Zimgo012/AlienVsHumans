package org.zimgo.aliensvshumans.game;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicManager {
    public static MediaPlayer mediaPlayer;

    public static void initialize(String audioFile) {
        if (mediaPlayer == null) {
            Media media = new Media(audioFile);
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop indefinitely
            mediaPlayer.play();
        }
    }
}