/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public class healSpell extends spell{
    private int power;
    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }

    public healSpell() {
        this.power = 5;
    }
    public void levelUp(){
        this.power += 2;
    }

    public healSpell(int power) {
        this.power = power;
    }
    
}
