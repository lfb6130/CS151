/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**dfgdfgdfgd
 *
 * @author luis
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class User extends Selections {

    private Scanner scan = new Scanner(System.in);
    private boolean proceed=true;

    public User()
    {
    }

    /**
     * User selects rock paper or scissors.
     */
    public void select()
    {
        System.out.println("Enter selection\n 1: Rock\n 2: Paper\n 3: Scissors");
        do
        {
            try
            {
                int num = scan.nextInt();
                if (num>0 && num<4)
                {
                    updateChoice(num);
                    proceed=false;
                }
                else
                    System.out.println("Please choose a choice shown above.");
            }
            catch(InputMismatchException e)
            {
                scan.nextLine();
                System.out.println("Please choose a choice shown below.");
            }
        }
        while(proceed);
    }

    public String getCurrentChoice()
    {
        return currentChoice();
    }

    public int getChoiceValue()
    {
        return choiceValue();
    }
}
