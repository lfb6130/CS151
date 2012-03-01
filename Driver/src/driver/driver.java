/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author group
 */
public class driver {

    public static void main(String[] args)
    {
        User player = new User();
        Computer comp = new Computer();
        Menu play = new Menu(player, comp);
        play.run();
        

    }
}
