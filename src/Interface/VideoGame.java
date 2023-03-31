package Interface;

import java.util.ArrayList;

public class VideoGame implements ISaveableM {

//    private int name;
//    private int killCount;
    private int killCount;
    private int characterHeight;
    private boolean isAlive;






    @Override
    public String toString() {
        return "VideoGame{" +
                "killCount=" + killCount +
                ", characterHeight=" + characterHeight +
                ", isAlive=" + isAlive +
                '}';
    }

    public int getKillCount() {
        return killCount;
    }

    public int getCharacterHeight() {
        return characterHeight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public VideoGame() {
    }

    @Override
    public ArrayList<Object> SaveState(Object killCount) {
        ArrayList<Object> Save = new ArrayList<>();

        Save.add(killCount);
        System.out.println("Kill count updated to "+ killCount);
        return Save;
    }

    @Override
    public Object RetrieveState(ArrayList<Object> list) {
        Object killnumber;
        return killnumber = list.get(list.size() - 1);

    }
}
