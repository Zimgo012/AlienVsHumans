package org.zimgo.aliensvshumans.game;

public class GlobalSettings {

    private static boolean backgroundMusicEnabled = true;
    private static boolean clickSoundEnabled = true;

    public static boolean isBackgroundMusicEnabled() {
        return backgroundMusicEnabled;
    }

    public static void setBackgroundMusicEnabled(boolean enabled) {
        backgroundMusicEnabled = enabled;
    }

    public static boolean isClickSoundEnabled() {
        return clickSoundEnabled;
    }

    public static void setClickSoundEnabled(boolean enabled) {
        clickSoundEnabled = enabled;
    }
}
