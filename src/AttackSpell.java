/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public class AttackSpell extends spell{
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public AttackSpell(int power) {
        this.power = power;
    }
    
    public void levelUp(){
        this.power += 1;
    }
    
}
