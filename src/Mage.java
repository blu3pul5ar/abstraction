/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public class Mage extends magicUser{

   
    private int health = 50;
    private int attack = 10;
    private int mana = 100;
    private double block = .05;
    AttackSpell fireball = new AttackSpell(6);
    healSpell lesserHeal = new healSpell(2);
    public spell[] spellBook ={fireball,lesserHeal};
   
    
    
    @Override
    public void attack(Being b) {
        b.setHealth(b.getHealth() - this.attack);
    }

    @Override
    public boolean block() {
        return false;
    }

 
    @Override
    public void castSpell(int spell, Being b) {
        System.out.println("Nick casts fireball at John!");
        spellBook[spell].cast(b);
    }

    @Override
    public void setMana(int m) {
        this.mana = m;
    }

    @Override
    public void setHealth(int b) {
        this.health = b;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getHealth() {
       return health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public double getBlock() {
        return block;
    }

    public void setBlock(double block) {
        this.block = block;
    }
    public void takeDamage(int d) {
        this.health -= d;
    }
    
}
