/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public class Fighter {
    public static void main(String [] args){
        Mage Nick = new Mage();
        Mage John = new Mage();
        while(John.getHealth()>0) {
        Nick.castSpell(0, John);
            System.out.println("John has " + John.getHealth() + " health left!");
        }
    }
}
