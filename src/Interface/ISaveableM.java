package Interface;

import java.util.ArrayList;

public interface ISaveableM {

    ArrayList<Object> SaveState(Object o) ;
//        ArrayList<Integer> aList = new ArrayList<>();
//        for (int i:varargs) {
//            aList.add(i);
//        } return aList;

    Object RetrieveState(ArrayList<Object> list) ;


}
