package com.company;


import java.util.*;


public class Main {



    public static WordGUI GUI;
    public static TextSorter TextReader;
    public static List<String> leftColumn;
    public static List<String> rightColumn;

    //Goals
    // 1. Create a GUI Object That Extends JFrame
    // 2. Read Input From A Text File & Print it onto the 1st Column
    // 3. Take The input & Sort it alphabetically and then print it onto the 2nd column

    public static void main(String[] args) {
	   // write your code here


        GUI        = new WordGUI("Project 1",1000,600);
        TextReader = new TextSorter("words.txt");

        leftColumn = TextReader.getWords();

        for (int i = 0; i < leftColumn.size() ; i++) {

            GUI.text1.append(leftColumn.get(i)+"\r\n");
        }

        rightColumn = TextReader.alphabetize(leftColumn);

        for (int z = 0; z < rightColumn.size() ; z++) {

            GUI.text2.append(rightColumn.get(z)+"\r\n");
        }

    }

}
