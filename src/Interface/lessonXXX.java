package Interface;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class lessonXXX {
    public static void main(String[] args) {

        LinkedList<Planet> list = new LinkedList<Planet>();


//        list.add(new Planet("Mercury", 100, 50));
//        list.add(new Planet("Mars", 220, 310));
//        list.add(new Planet("Jupiter", 600, 710));
//        list.add(new Planet("Earth", 250, 220));
//        list.add(new Planet("Venus", 200, 110));

//        list.add(new Planet ("Earth", 250, 220));
        addPlanets(list, new Planet("Jupiter", 600, 710));
        addPlanets(list, new Planet("Earth", 250, 220));
        addPlanets(list, new Planet("Mars", 220, 310));
        addPlanets(list, new Planet("Earth", 250, 220));
        addPlanets(list, new Planet("Mercury", 100, 50));
        addPlanets(list, new Planet("Venus", 200, 110));


        System.out.println(list);
        ListIterator<Planet> it = list.listIterator();
//        System.out.println(it.next());
//
//        while (it.hasNext()) {
//
//            it.next();
//            System.out.println("test " + it.next().getName());
//            it.previous();
//            System.out.println("test " + it.previous().getName());
//        }
        boolean quit = false;
        boolean forward = false;
        Scanner scanner = new Scanner(System.in);
        printMenu();

        while (!quit) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "0":
                    quit = true;

                case "1":
                    if(!it.hasNext()) {
                        System.out.print("Currently at th end");
                        break;
                    }
                    if (!forward) {
                        forward = true;
                        if (it.hasNext()) {
                            it.next();
                        }
                    }
                    System.out.println("Moving to planet " + it.next().getName());
                    break;
                case "2":
                    if(!it.hasPrevious()) {
                        System.out.print("Currently at the start");
                        break;
                    }



                    if (forward) {
                        forward = false;
                        if (it.hasPrevious()) {
                            it.previous();
                        }
                    }

                    System.out.println("Moving to planet " + it.previous().getName());
                    break;
                case "3":
                    System.out.println("Currently orbiting planet " + it.previous());
                    break;
                case "4":
                    System.out.println("Currently orbiting planet " + it.previous().getName());
                case "5":
                    System.out.println("Currently orbiting planet " + it.previous().getName());
                case "6":
                    System.out.println("Currently orbiting planet " + it.previous().getName());
            }
        }
    }
        private static void printMenu () {
            System.out.println("Available actions:\npress");
            System.out.println("0 - to quit\n" +
                    "1 - switch to next planet\n" +
                    "2 - switch to previous planet\n" +
                    "3 - display the planet info\n" +
                    "4 - list all planets\n" +
                    "5 - print available actions.\n" +
                    "6 - delete the planet");

        }

        private static void addPlanets (LinkedList < Planet > list, Planet planet){
//        if (list.contains(planet))
//        for (Planet p : list) {
//            if (p.name.equalsIgnoreCase(planet.name))

            for (Planet p : list) {
                if (p.getName().equalsIgnoreCase(planet.getName())) {
                    System.out.println("Found duplicate " + planet.getName());
                    return;
                }
            }
            if (list.isEmpty()) {
                list.add(planet);
                return;
            }
            int index = 0;
            for (Planet p : list) {

                if (p.getSunDistance() > planet.getSunDistance()) {
                    list.add(index, planet);
                    System.out.println(planet.name + " added to planets");
                    return;
                }
                index++;
                list.add(index, planet);
                System.out.println(planet.name + " added to planets");
                return;
            }
        }
    }
