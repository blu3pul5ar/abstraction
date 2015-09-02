/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public abstract class spell {
    public abstract void setPower(int power);
    public abstract int getPower();
    public abstract void levelUp();
    public void cast(Being b){
        b.takeDamage(this.getPower());
    }
}
