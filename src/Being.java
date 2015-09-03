/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */

public interface Being {
    public void setName(String n);
    public String getName();
    public void setHealth(int b);
    public int getHealth();
    public void attack(Being b);
    public boolean block();
    public void takeDamage(int d);
}
