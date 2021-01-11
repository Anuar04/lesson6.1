package com.company;

public class Boss extends GameEntity {
    private Weapon weaponOfBoss;

    public Weapon getWeaponOfBoss() {
        return weaponOfBoss;
    }

    public void setWeaponOfBoss(Weapon weaponOfBoss) {
        this.weaponOfBoss = weaponOfBoss;
    }

    public String printInfo() {
        return " Name: " + this.getName() + "\n Health:  " + getHealth() + "\n Damage : " + getDamage() +
                "\n Weapon type: " + getWeaponOfBoss().getNameOfWeapon() + "\n Weapon name: " +
                getWeaponOfBoss().getTypeOfWeapon();
    }
}
