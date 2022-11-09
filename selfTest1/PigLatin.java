//English words can be translated into a language "pig latin" by moving the first letter of the word to 
//the end of the word and adding "ay".

//For example,  "Happy Halloween" in pig latin is: "Appyhay Alloweenhay"

//Write a program called PigLatin that asks the user for their first and last name and prints their full name in pig latin.  Don't forget to capitalize the first letter of the first and last names - the rest of the name should be lowercase.

import java.util.Scanner;


public class PigLatin {

    public static void main(String[] args) {

        System.out.println("I will convert your first and last name into Pig Latin");
        System.out.println("Please enter your first name:");
        Scanner keyboard = new Scanner(System.in);

        String firstName, lastName;
        String firstChar, secondCharUpper;

        firstName = keyboard.next();

        System.out.println("Please enter your last name:");

        lastName = keyboard.next();

        // Work with first name to convert it to lowercase and then save the first character etc. 

        firstName = firstName.toLowerCase();
        firstChar = firstName.substring(0,1);
        secondCharUpper= firstName.substring(1,2).toUpperCase();

        //now to move the parts of the first name around to make piglatin
        String firstNamePig, lastNamePig;

        firstNamePig= secondCharUpper+firstName.substring(2) + firstChar + "ay";

        //Now work with the last name

        lastName = lastName.toLowerCase();
        firstChar = lastName.substring(0, 1);
        secondCharUpper = lastName.substring(1,2).toUpperCase();

        lastNamePig = secondCharUpper+lastName.substring(2) + firstChar + "ay";


        //print name in pig latin
        System.out.println("Your name in pig latin is");
        System.out.println(firstNamePig + " " + lastNamePig);

    }
}
