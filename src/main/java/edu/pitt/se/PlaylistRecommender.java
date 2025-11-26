package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        int total = 0;
        int numBpm = 0;
        for (Integer bpm : bpms) {
            total += bpm;
            numBpm++;
        }
        int avg = total/numBpm;
        String returner = "MEDIUM";
        if (avg >= 140) {
            returner = "HIGH";
        }
        if (avg < 100) {
            returner = "LOW";
        }
        return returner;
    }

    public static boolean isValidTrackTitle(String title) {
        String validChar = "ABCDEFGHIJKLMNOPQRXTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        boolean returner = title.isEmpty();
        for (char c : title.toCharArray()) {
            returner = validChar.contains(""+c);
            if (returner == false) {
                return returner;
            }
        }
        if (title.length() > 30) {
            return false;
        }
        return returner;
    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb > 100) {volumeDb = 100;}
        if (volumeDb < 0) {volumeDb = 0;}
        return volumeDb;
    }
}
