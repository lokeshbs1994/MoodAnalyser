package com.moodanalyser;

public class MoodAnalyser {
    private static String message;

    //constructor return the message- parameterised conctructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    // Analysing mood using method analyse mood with parameter passed
    public String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
