/* Calculate X to the power of n using a loop */

import java.util.Scanner;

public class Ex1 
{
    public static void main (String [] args)
    {

        Scanner keyboard = new Scanner (System.in);
        
        int x =0, n = 0;
        int power = 1;

        //get input of x from user
        System.out.println("Enter an interger value for x");
        if (keyboard.hasNextInt())
        {
            x = keyboard.nextInt();

        }
        else
        {
            System.out.println("Error: Invalid Input");
            System.exit(0);
        }

        // get input of n from user
        System.out.println("Enter and interger value for n");
        if (keyboard.hasNextInt())
        {
            n = keyboard.nextInt();
        }

        // n should be positive
        if (n < 0)
        {
            System.out.println("You should enter a positive value");
            System.exit(0);
        }

        //make calculation using for loop
        for (int i = 1; i<= n; i++)
        {
            power *= x;            
        }

        System.out.println(x +" to the power of "+ n +"=" + power);

    }


}

