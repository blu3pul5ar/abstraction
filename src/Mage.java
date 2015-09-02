/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nick
 */
public class Mage extends MagicUser{
    private int health;
    private int attack;
    private int mana;
    private double block;
    private String Name;
    private Spell[] spellBook = new Spell[5];
    AttackSpell fireball = new AttackSpell("Fireball",6);
    HealSpell lesserHeal = new HealSpell("lesser Heal",2);
    public Mage(String Name) {
        this.Name=Name;
        health = 50;
        attack = 10;
        mana = 100;
        block = .05;
        spellBook[0]=fireball;
        spellBook[1]= lesserHeal;
    }

    

    
    
    @Override
    public void attack(Being b) {
        b.setHealth(b.getHealth() - this.attack);
    }

    @Override
    public boolean block() {
        return false;
    }

 
    @Override
    public void castSpell(int magic, Being b){
        Spell spell = spellBook[magic];
        System.out.println(this.Name + " cast " + spell.getName() + " at " + b.getName());
        spell.cast(b);
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
