package com.example.restservice;

import java.util.HashMap;
import java.util.LinkedHashMap;
// This class takes a String and returns a String of the n  most frequent words
// along with their frequency in descending order
public class WordFrequency {

    public static String wordFreq(String textFile, Integer numberOfWords){
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        String outputString ="";
        // Controls the number of words returned
        //Create map of every word in input string and its frequency
        for (String word : textFile.split("\\s")) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word,0)+1);
        }
        //Sort frequencyMap and put in LinkedHashMap, sortedMap to maintain frequency order.
        frequencyMap.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue())).limit(numberOfWords)
                .forEachOrdered(pair -> sortedMap.put(pair.getKey(),pair.getValue()));
        // converts LinkedHashMap into string
        for (String entry : sortedMap.keySet()){
            outputString=outputString+" Word:"+entry+" Frequency:"+sortedMap.get(entry)+" ||";
        }
        return outputString;


    }
}

