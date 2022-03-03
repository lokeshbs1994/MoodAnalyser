package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }
    // passing parameter through constructor
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser("i am Sad");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser("i am Happy");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenAnyMessage_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser("fhj");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    // passing null
    @Test
    public void givenNull_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNull_ShouldReturnHappy2() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String mood = moodanalyser.analyseMood(null);
        Assert.assertEquals("HAPPY", mood);
    }
}