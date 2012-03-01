/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author luis
 */
import java.util.Random;
public class Computer extends Selections {

    Random gen = new Random();

    public Computer()
    {
    }

    /**
     * computer randomly chooses integer 1-3.
     */
    public void select()
    {
        int num = gen.nextInt(2)+1;
        updateChoice(num);

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
