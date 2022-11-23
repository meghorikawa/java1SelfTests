/**
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS22/23
 * Assignment:  (lab4, exercise1)
 * Author:      (Megan Horikawa)
 * Description: (create a program that gives the stem of a word)
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from:
 *   (no one)
 *  in designing and debugging my program.
 */


import java.util.Scanner;


public class Stemmer 
{
    public static void main(String[] args) 
    {
    
    //allow input
    System.out.println("Enter your words in the following line:");
    Scanner keyboard = new Scanner(System.in);
    String wordList = keyboard.nextLine();
    Scanner lineScanner = new Scanner(wordList);

    while (lineScanner.hasNext()){
    
        String word = lineScanner.next();
        //assign variable to final characters of word
        int len = word.length();
        //last 4 characters indexed
        String lastFour = word.substring(len-4);
        //last character
        String lastChar=word.substring(len-1);

        //If the word ends in "ing" and is longer than 4 letters, remove the "ing".
        if ((word.length() <= 4) && ((lastFour.contains("ing"))))
        {
            //shorter than 4 letters so nothing is done
            System.out.println(word + " - " + word);
            
        }
        else if (((lastFour.contains("ing")) && (word.length() > 4)))
        {
            //delete ing if more than 4 letters
            System.out.println(word + " - " + word.substring(0, len-3));

        }

        //If the word ends in "sses", remove the final "es".
        else if (lastFour.contains("sses"))
        {
            System.out.println(word + " - " + word.substring(0, len-2));
        }
    
        //If the word ends in "ies", replace the "ies" with "y".
        else if (lastFour.contains("ies"))
        {
            System.out.println(word + " - " + word.substring(0, len-3) + "y");
        }

        //If the word ends in "s", but not in "sses", "ies", or "ss", then remove the final "s".
        else if ((lastChar.equals("s") && (!lastFour.contains("ies"))&& (!lastFour.contains("sses")) && (!lastFour.contains("ss"))))
        {
            System.out.println(word + " - " + word.substring(0, len-1));
        }

        //If the word ends in "eed" and is longer than 4 letters, remove the final "d".
        else if ((word.length()> 4) && (lastFour.contains("eed")))
        {
            System.out.println(word + " - " + word.substring(0, len-1));
        }

        //If the word ends in "ed" but not in "eed" and is longer than 4 letters, remove the final "ed".
        else if ((lastFour.contains("ed")) && (word.length()> 4) && (!lastFour.contains("eed")))
        {
            System.out.println(word + " - " + word.substring(0, len-2));
 
        }
        else
        {
            System.out.println(word + " - " + word);
        }

        }
        keyboard.close();
        lineScanner.close();
    }
}