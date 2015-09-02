/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
import java.util.Scanner;
public class Fighter {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        
        Mage Nick = new Mage("Nick");
        Mage John = new Mage("John");
        while(!(Nick.getHealth() < 0) && !(John.getHealth()<0)) {
            Nick.castSpell(0, John);
            System.out.println("John has " + John.getHealth() + " health left!");
            if(John.getHealth()<= 0){
                System.out.println("John Died");
            }else{
                John.castSpell(0, Nick);
                System.out.println("Nick has " + Nick.getHealth() + " health left!");
            }
        }
    }
}
