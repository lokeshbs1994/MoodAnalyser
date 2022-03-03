package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    //constructor return the message- parameterised constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) throws  MoodAnalysisException{
        this.message = message;
        return analyseMood();
    }

    // Analysing mood using method analyse mood with parameter passed
    public String analyseMood() throws MoodAnalysisException{
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException ("Entered Invalid Mood");
        }
    }
}
