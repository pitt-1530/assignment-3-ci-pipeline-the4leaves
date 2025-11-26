package edu.pitt.se;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PlaylistRecommenderTest {

    @Test
    public void testClassify() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(new ArrayList<>(Arrays.asList(150, 130, 170))));
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(new ArrayList<>(Arrays.asList(130, 110, 120))));
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(new ArrayList<>(Arrays.asList(70, 80, 90))));
    }
    @Test
    public void testTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Valid Song Title"));
        assertFalse(PlaylistRecommender.isValidTrackTitle("Invalid Song Title!"));
        assertFalse(PlaylistRecommender.isValidTrackTitle("Invalid Song Title due to title length"));
    }
    @Test
    public void testNormalize() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(110));
        assertEquals(50, PlaylistRecommender.normalizeVolume(50));
        assertEquals(0, PlaylistRecommender.normalizeVolume(-10));
    }
}
