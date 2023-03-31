package Generics;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SockerPlayer beckham = new SockerPlayer("Beckham");


        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SockerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);
//        System.out.println("Rankings");
//        System.out.println(adelaideCrows.getName()+": "+adelaideCrows.ranking());
//        System.out.println(melbourne.getName()+": "+melbourne.ranking());
//        System.out.println(fremantle.getName()+": "+fremantle.ranking());
//        System.out.println(hawthorn.getName()+": "+hawthorn.ranking());
//        System.out.print(adelaideCrows.compareTo(melbourne));
//        System.out.println(adelaideCrows.compareTo(hawthorn));
//        System.out.println(hawthorn.compareTo(adelaideCrows));
//        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams;
//        Collections.sort(teams);
        TeamLeague<Team<FootballPlayer>> fifa  = new TeamLeague<>("fifa");
        fifa.addTeam(hawthorn);
//        fifa.addTeam(baseballTeam);
        fifa.addTeam(adelaideCrows);
        fifa.addTeam(fremantle);
        System.out.println(fifa);
fifa.printLeagueResults();
Team rawTeam = new Team<>("raw");
fifa.addTeam(rawTeam);

    }
}