package com.moodanalyser;

public class MoodAnalysisException extends Exception {
    public String message;

    enum ExceptionType {
        EMPTY, NULL;
    }

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
