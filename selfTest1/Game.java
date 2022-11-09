import java.util.Scanner;

public class Game {
    
    public static void main (String[] args) {

        String name;
        int strength, intelligence, luck; 

        name = " ";
        strength = 0;
        intelligence = 0;
        luck = 0; 

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the name of your Character:");
        name = keyboard.next();

        System.out.println("Enter strength (1-10):");
        strength = keyboard.nextInt();

        System.out.println("Enter intelligence (1-10): ");
        intelligence = keyboard.nextInt();

        System.out.println("Enter luck (1-10):");
        luck = keyboard.nextInt();

        // make warning message if all stat points add up to over 15

        if (strength + intelligence + luck > 15){

            System.out.println("You have given your character too many points! Default values have been assigned:");

            strength = intelligence = luck = 5;

            System.out.println("Character name:" + name);
            System.out.println("Strength:" + strength);
            System.out.println("Intelligence:" + intelligence);
            System.out.println("Luck:" + luck);
        }
        
        else{
            System.out.println("Congratulations you have created the following character:");
            System.out.println("Character name:" + name);
            System.out.println("Strength:" + strength);
            System.out.println("Intelligence:" + intelligence);
            System.out.println("Luck:" + luck);
        }

        

    }
    
}
