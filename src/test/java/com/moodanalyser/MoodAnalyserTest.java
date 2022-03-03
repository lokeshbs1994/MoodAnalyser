package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }

    // passing parameter through constructor
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser("i am Sad");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser("i am Happy");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenAnyMessage_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser("fhj");
        String mood = moodanalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    // passing null

    @Test
    public void given_Null_ShouldReturnMessage() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        try {
            String mood = moodanalyser.analyseMood();
            Assert.assertEquals("Invalid Mood", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenConstructor_Null_ShouldReturnMessage() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        try {
            String mood = moodanalyser.analyseMood();
            Assert.assertEquals("Invalid Mood", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessageInMethod_Null_ShouldReturnMessage() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        try {
            String mood = moodanalyser.analyseMood("");
            Assert.assertEquals("Empty Mood", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_Null_ShouldReturnMessage() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        try {
            String mood = moodanalyser.analyseMood(null);
            Assert.assertEquals("Invalid Mood", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}