package com.company;

import java.util.*;
/**
 * Created by michaelkantor on 3/6/15.
 */
public class TextSorter {


    public TextFileInput reader;

    public TextSorter(String textFileLocation){

        reader = new TextFileInput(textFileLocation);


    }


    public List<String> getWords() {

        String currentLine;
        List<String> words = new ArrayList<String>();

        while ((currentLine = reader.readLine()) != null) {

             String[] x  = currentLine.split(",");

             for(int i = 0; i < x.length; i++) {
                words.add(x[i]);
            }
        }
        return words;
    }


    public List<String> alphabetize(List<String> currentColumn){

        List<String> words =  currentColumn;

        for (int i = 1; i < currentColumn.size() ; i++) {

            String currentWord  = currentColumn.get(i);
            String previousWord = currentColumn.get(i - 1);

            //if compareTo < 1, then currentWord needs to be earlier in the alphabet
            if(currentWord.compareTo(previousWord) < 1){

                words.set(i - 1, currentWord);
                words.set(i,previousWord);
                i = 0;
                continue;
            }
        }

        return words;
    }
}
