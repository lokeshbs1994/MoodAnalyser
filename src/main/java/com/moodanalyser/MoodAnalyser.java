package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser(){
    }

    public String  analyseMood(String message) throws MoodAnalysisException{
        this.message = message;
        return analyseMood();
    }

    // Analysing mood using method analyse mood with parameter passed
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Empty mood");
            }
            if (message.toLowerCase().contains("sad")) {
                System.out.println("SAD");
                return "SAD";
            } else {
                System.out.println("HAPPY");
                return "HAPPY";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Invalid mood");
        }
    }
}
