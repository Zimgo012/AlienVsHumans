package org.zimgo.aliensvshumans.game;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.HashMap;
import java.util.Map;

public class MusicManager {

    private static MediaPlayer currentMediaPlayer; // To keep track of the currently playing track
    private static Map<String, MediaPlayer> mediaPlayers = new HashMap<>();
    private static Map<String, MediaPlayer> soundEffects = new HashMap<>();

    // Initialize a music track and store it in the map
    public static void initializeTrack(String trackName, String audioFile) {
        if (!mediaPlayers.containsKey(trackName)) {
            Media media = new Media(audioFile);
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop indefinitely if needed
            mediaPlayers.put(trackName, mediaPlayer);
        }
    }

    // Play a specific track
    public static void playTrack(String trackName) {
        // Stop the current track if it's playing
        if (currentMediaPlayer != null) {
            currentMediaPlayer.stop();
        }

        MediaPlayer mediaPlayer = mediaPlayers.get(trackName);
        if (mediaPlayer != null) {
            mediaPlayer.play();
            currentMediaPlayer = mediaPlayer; // Update the currentMediaPlayer
        }
    }

    // Stop the current track
    public static void stopCurrentTrack() {
        if (currentMediaPlayer != null) {
            currentMediaPlayer.stop(); // Clear the reference to the current track
        }
    }

    public static void playCurrentTrack() {
        if (currentMediaPlayer != null) {
            currentMediaPlayer.play(); // Play the current track
        }
    }

    // Initialize and store a sound effect
    public static void initializeSoundEffect(String soundName, String audioFile) {
        if (!soundEffects.containsKey(soundName)) {
            Media media = new Media(audioFile);
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setCycleCount(1); // Play only once
            soundEffects.put(soundName, mediaPlayer);
        }
    }

    // Play a stored sound effect
    public static void playSoundEffect(String soundName) {
        MediaPlayer mediaPlayer = soundEffects.get(soundName);
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }
    }

    public static Map<String, MediaPlayer> getMediaPlayers() {
        return mediaPlayers;
    }

    public static Map<String, MediaPlayer> getSoundEffects() {
        return soundEffects;
    }

    public static void setMediaPlayers(Map<String, MediaPlayer> mediaPlayers) {
        MusicManager.mediaPlayers = mediaPlayers;
    }

    public static void setSoundEffects(Map<String, MediaPlayer> soundEffects) {
        MusicManager.soundEffects = soundEffects;
    }
}
