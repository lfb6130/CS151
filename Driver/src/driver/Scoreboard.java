/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author luis
 */
public class Scoreboard {
    
    private int wins=0;
    private int losses=0;
    private int ties=0;

    public Scoreboard()
    {     
    }
/**
 * Takes user and computer choices and determines winner of throw.
 * @param player
 * @param comp
 */
    public void determine(User player, Computer comp)
    {
        int sum = player.choiceValue()-comp.choiceValue();
        if (sum >0 && sum!=2)
            wins++;
        else if (sum==0)
            ties++;
        else
            losses++;
    }
/**
 *
 * @return Scoreboard
 */
    public String viewScore()
    {
        return "Wins     Losses      Ties\n" + this.wins + "          " +
                this.losses+"            "+ this.ties;
    }

}
