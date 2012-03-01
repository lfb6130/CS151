/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author luis
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

    SetGame game;
    User player;
    Computer comp;
    Scoreboard score = new Scoreboard();
    Help help = new Help();

    boolean quit = false;

    public Menu(User u, Computer c)
    {
        game = new SetGame();
        player= u;
        comp=c;
    }
/**
 * Main method that runs the game. Method enters submenu that offers user to view scoreboard, view help
 * quit, or continue game. When user selects to continue playing game, submenu exits and user is prompted to
 * make a selection.
 */
    public void run()
    {
        System.out.println("Welcome to Rock Paper Scissors");
        game.set();
        for(int i = 0; i<game.getSet();i++)
        {
            subMenu();
            if (quit)
                break;
            player.select();
            comp.select();
            System.out.println("You selected "+ player.getCurrentChoice()+"\n"
                    +"Computer selected "+ comp.getCurrentChoice());
            score.determine(player,comp);
            System.out.println(score.viewScore());
        }
    }
/**
 * Prompts user options to continue playing, view score, help or quit.
 */
    public void subMenu()
    {
        Scanner scan = new Scanner(System.in);
        boolean stay=true;
        boolean proceed=true;
        while(stay)
        {
        System.out.println("Please choose a selection:\n 1: Make a throw.\n 2: View scoreboard\n"+
                " 3: View help\n 4: Quit");
        do
        {
            try
            {
                int num = scan.nextInt();
                if (num ==1)
                {
                    stay = false;
                    proceed = false;
                }
                else if (num==2)
                {
                    System.out.println(score.viewScore());
                    proceed=false;
                }
                else if (num==3)
                {
                    System.out.println(help.helpMessage());
                    proceed=false;
                }

                else if (num==4)
                {
                    quit= true;
                    stay = false;
                    proceed=false;
                }
                else
                {
                    System.out.println("Please choose a choice shown above.");
                }
            }
            catch(InputMismatchException e)
            {
                scan.nextLine();
                System.out.println("Please choose a choice shown above.");
            }
        }
        while(proceed);
    }
    }

}
