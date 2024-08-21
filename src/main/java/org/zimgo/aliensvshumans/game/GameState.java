package org.zimgo.aliensvshumans.game;

public class GameState {

    private static double currentTime = 0;
    private static boolean isPaused = false;

    public static void setCurrentTime(double time) {
        currentTime = time;
    }

    public static double getCurrentTime() {
        return currentTime;
    }

    public static void setPaused(boolean paused) {
        isPaused = paused;
    }

    public static boolean isPaused() {
        return isPaused;
    }
}
