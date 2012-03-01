/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author luis
 */
public abstract class Selections {
    private String currentChoice;
    private int choiceValue;

    /**
     * Determines selection from input integer.
     * @param choice
     */
    public void updateChoice(int choice)
    {
        if (choice == 1)
        {
            currentChoice = "rock";
            choiceValue= choice;
        }
        else if(choice==2)
        {
            currentChoice = "paper";
            choiceValue=choice;
        }
        else
        {
            currentChoice = "scissors";
            choiceValue=choice;
        }
    }
/**
 * Return selection as string
 * @return
 */
    public String currentChoice()
    {
        return currentChoice;
    }

    /**
     * returns selection as integer.
     * @return
     */
    public int choiceValue()
    {
        return choiceValue;
    }

/**
 * method to make selection.
 */
    abstract void select();

}

