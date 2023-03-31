package Interface;

import java.util.ArrayList;
import java.util.List;

public class Player2 implements ISaveable2 {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player2(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this. weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(0, this.name);
        list.add(1, "" + this.hitPoints);
        list.add(2, "" + this.strength);
        list.add(3, "" + this.weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
    if((list!=null) && (list.size()>0)) {
    this.name = list.get(0);
    this.hitPoints = Integer.parseInt(list.get(1));
    this.strength = Integer.parseInt(list.get(2));
    this.weapon = list.get(3);
}

    }

    @Override
    public String toString() {
        return "Player2{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
