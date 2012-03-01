/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author luis
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class SetGame {

    private Scanner in;
    private int num = 0;


    public SetGame()
    {
        in = new Scanner(System.in);
    }

    /**
     * Asks the user to input how many throws for a match.
     */
    public void set()
    {
        boolean proceed = true;
        System.out.println("Please set the number of throws for this match.");
        do
        {
        try
        {
        num = in.nextInt();
        if (num>=0)
            proceed = false;
        else
            System.out.println("Please enter a positive integer.");
        }
        catch(InputMismatchException e)
        {
         in.nextLine();
         System.out.println("Please enter a positve integer.");
        }
        }
        while(proceed);
    }

    /**
     * Returns number of throws per match.
     * @return number of throws.
     */
    public int getSet()
    {
        return num;
    }

}

