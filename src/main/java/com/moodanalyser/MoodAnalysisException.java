package com.moodanalyser;

public class MoodAnalysisException extends Exception {
    public String message;

    public MoodAnalysisException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
