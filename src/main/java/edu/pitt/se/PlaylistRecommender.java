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
        // TODO: Implement isValidTrackTitle()
        throw new UnsupportedOperationException("Not implemented");
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        throw new UnsupportedOperationException("Not implemented");
    }
}
