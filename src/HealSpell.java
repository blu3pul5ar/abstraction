/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public class HealSpell extends Spell{

    public HealSpell(String name, int power) {
        super(name, power);
    }
    
    public void levelUp(){
        this.power += 2;
    }
    
}