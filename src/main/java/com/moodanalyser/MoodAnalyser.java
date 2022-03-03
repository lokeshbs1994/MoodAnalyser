package com.moodanalyser;

import java.util.Locale;

public class MoodAnalyser {
// Analysing mood using method analyse mood with parameter passed
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else if (message.toLowerCase().contains("happy"))
            return "HAPPY";
        else
            return null;

    }
}
