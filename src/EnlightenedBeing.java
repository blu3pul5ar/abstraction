/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public interface EnlightenedBeing extends Being{
    public void setMana(int m);
    public int getMana();

    @Override
    public void setHealth(int b);

    @Override
    public int getHealth();

    @Override
    public void attack(Being b);
  
    @Override
    public boolean block();
    
}
