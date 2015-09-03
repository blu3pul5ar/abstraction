/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public class AttackSpell extends Spell{

    public AttackSpell(String name, int power) {
        super(name, power);
    }
    public AttackSpell(String name, int power,int cost) {
        super(name, power);
        this.setCost(cost);
    }
    public void levelUp(){
        this.setPower(this.getPower()+5);
    }
    
}
