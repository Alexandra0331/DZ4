package Weapons;
import Shields.NullShield;
import Shields.Shield;
import Shields.Shieldable;

import java.util.Random;

public class Sword extends Weapon {

    public Sword(int pointOfDamage) {
        super(pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("Урон от меча = %d", pointOfDamage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

}