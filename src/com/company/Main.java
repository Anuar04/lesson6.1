package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setName("Джекичан");
        Weapon bossWeapon = new Weapon();
        bossWeapon.setNameOfWeapon("gun");
        bossWeapon.setTypeOfWeapon("physics!!!");
        boss.setWeaponOfBoss(bossWeapon);
        System.out.println(boss.printInfo());
        System.out.println("________________");
        Skeletons skeleton1 = new Skeletons(5);
        skeleton1.setHealth(70);
        skeleton1.setDamage(10);
        skeleton1.setName("King of Skeletons.");
        Weapon skeletonsWeapon = new Weapon();
        skeletonsWeapon.setNameOfWeapon("Excalibur!");
        skeletonsWeapon.setTypeOfWeapon("Sword");
        skeleton1.setWeaponOfBoss(skeletonsWeapon);
        Skeletons skeleton2 = new Skeletons(1);
        skeleton2.setHealth(60);
        skeleton2.setDamage(8);
        skeleton2.setName("Skeleton of hell");
        skeleton2.setWeaponOfBoss(skeletonsWeapon);
        System.out.println(skeleton1.printInfo());
        System.out.println("________________");
        System.out.println(skeleton2.printInfo());

    }
}
