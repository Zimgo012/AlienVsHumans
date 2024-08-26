package org.zimgo.aliensvshumans.game;

public class GameState {

    private static int currentStoryPoint = 0;

    public static int getCurrentStoryPoint() {
        return currentStoryPoint;
    }

    public static void setCurrentStoryPoint(int storyPoint) {
        currentStoryPoint = storyPoint;
    }

    public static void resetStoryPoint() {
        currentStoryPoint = 0;
    }
}
