package Interface;

import java.util.ArrayList;
import java.util.List;

public class Monster2 implements ISaveable2 {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster2(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster2{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(0, this.name);
        list.add(1, "" + this.hitPoints);
        list.add(2, "" + this.strength);

        return list;
    }

    @Override
    public void read(List<String> list) {
        if((list!=null) && (list.size()>0)) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));

        }

    }





}