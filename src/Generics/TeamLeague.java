package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class TeamLeague< T extends Team> {
//   public class TeamLeague< T extends Team<P>, P extends Player> {
   private String name;
   private ArrayList<T> league = new ArrayList<T>();

   public TeamLeague(String name) {
      this.name = name;
   }

   public boolean addTeam(T team) {
      if (league.contains(team)) {
         System.out.println("Team already in league");
         return false;
      } else {
         System.out.println("Team "+team.getName()+" added to league");
         league.add(team);
         return true;
      }
   }

   public void printLeagueResults ( ){
      Collections.sort(league);
      for (T t : league) {
         System.out.println(t.getName()+ " rank is "+t.ranking());
      }
   }





   @Override
   public String toString() {
      return "TeamLeague{" +
              "name='" + name + '\'' +
              ", league=" + league +
              '}';
   }
}