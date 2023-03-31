import java.util.*;

public class lesson140_challenge {
    public static void main(String[] args) {
//        var AusTownList = new LinkedList<PlaceL140>();
        LinkedList<PlaceL140> AusTownList = new LinkedList<>();

        addMoreLocations(AusTownList, new PlaceL140("Sydney", 0));
        addMoreLocations(AusTownList, new PlaceL140("Warsaw", 15500));
        addMoreLocations(AusTownList, new PlaceL140("Brisbane", 917));
        addMoreLocations(AusTownList, new PlaceL140("Darwin", 3972));
        addMoreLocations(AusTownList, new PlaceL140("Melbourne", 877));
        addMoreLocations(AusTownList, new PlaceL140("Adelaide", 1374));
        addMoreLocations(AusTownList, new PlaceL140("Perth", 3923));
        System.out.println(AusTownList);

//        printList(AusTownList);
        Scanner scanner = new Scanner(System.in);
        boolean isON = true;
//        boolean isON = false;
        int index = 0;
        while (isON) {
            String Initial = """
                    Available actions (select word or letter): 
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (M)enu
                    (Q)uit 
                    """;

            System.out.println("Choose action: ");
            String input = (scanner.nextLine());

            if (Objects.equals(input, "Q") || Objects.equals(input, "Quit")) {
                isON = false;
                System.out.println("Quitting");
            } else if (Objects.equals(input, "M") || Objects.equals(input, "Menu")) {

                System.out.println(Initial);
            } else if (Objects.equals(input, "F") || Objects.equals(input, "Forward")) {
                index++;
                testIterator(AusTownList, index);

            } else if (Objects.equals(input, "B") || Objects.equals(input, "Backward")) {
                if (index == 0) {
                    System.out.println("Already at starting location");
                } else {
                    index--;
                    testIterator(AusTownList, index);
                }
            }
            else if (Objects.equals(input, "L") || Objects.equals(input, "List Places")) {
                printList(AusTownList, index);

                }
            }



        }

    public static void testIterator(LinkedList<PlaceL140> list, int index) {
        var iterator = list.listIterator();
//        while (iterator.hasNext()) {
////    System.out.println(iterator.next());
//            if (iterator.next().equals("Brisbane")) {
//                iterator.add("Lake Wivenhoe");
//            }
//        }
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//        System.out.println(list);

        var iterator2 = list.listIterator(index);
        System.out.println("The current destination is " + iterator2.next().getName());

    }


    private static void addMoreLocations(LinkedList<PlaceL140> list, PlaceL140 town) {

        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(town.getName(), list.get(i).getName())) {
                System.out.println("Town " + town.getName() + " already on the list");
                return;
            } else if (town.getDistance() < list.get(i).getDistance()) {
                list.add(i, town);
                return;
            }
        }
        list.add(town);
    }

    private static void printList(LinkedList<PlaceL140> list, int index) {

        int distance = list.get(index + 1).getDistance() - list.get(index).getDistance();
        String townName = list.get(index).getName();
        String nextTownName = list.get(index + 1).getName();
        ListIterator<PlaceL140> iterator = list.listIterator(index);
        while (iterator.hasNext()) {
            var name = iterator.next().getName();
            System.out.println(name);
        }
            System.out.println("Current town is " + townName + ". Distance to next town " + nextTownName + " is " + distance+" km.");

//        Object previousTown = list.getFirst();
//        ListIterator<PlaceL140> iterator = list.listIterator(0);
//        while (iterator.hasNext()) {
//            var name = iterator.next();
//            System.out.println(name);
//        }
        }

    }


