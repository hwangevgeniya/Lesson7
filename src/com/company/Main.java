package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here

        Magic magicHero = new Magic();
        Medic medicHero = new Medic();
        Warrior warriorHero = new Warrior();

        medicHero.setHealth(700);
        medicHero.setDamage(50);
        medicHero.setSuperAbilityType("Супер лечение");

        magicHero.setHealth(500);
        magicHero.setDamage(20);
        magicHero.setSuperAbilityType("Супер магия");

        warriorHero.setHealth(1000);
        warriorHero.setDamage(200);
        warriorHero.setSuperAbilityType("Супер удар");

        /*magicHero.applySuperAbility("Супер магия");
        medicHero.applySuperAbility("Супер лечение");
        warriorHero.applySuperAbility("Супер удар");*/


        Hero[] heroes = {magicHero,medicHero,warriorHero};


        for (int i = 0; i < heroes.length; i++) {

            System.out.println(heroes[i].applySuperAbility(heroes[i].getSuperAbilityType()));
            System.out.println(heroes[i].getHealth());
            System.out.println(heroes[i].getDamage());

            System.out.println("______________________________");

        }
        
    }
}
