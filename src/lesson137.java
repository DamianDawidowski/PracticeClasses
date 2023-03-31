import java.util.LinkedList;
import java.util.ListIterator;

public class lesson137 {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
//        printItenerary3(placesToVisit);
testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darvin");
        list.addFirst("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Alice Springs");

    }

    public static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed"); //removes first elements

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed"); //removes first elements

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed"); //removes last elements

        String p1 = list.poll(); //removes first elements
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst(); //removes first elements
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast(); //removes first elements
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("retrieved Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darvin is at position: " + list.indexOf("Darvin"));
        System.out.println("Melbourne is at position: " +
                list.lastIndexOf("Melbourne"));
        //Queue retrieval method
        System.out.println("Element from element() = " + list.element());
//Stack retrieval methods
        System.out.println(list);
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItenerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
            System.out.println("Trip ends at " + list.getLast());

    }
        public static void printItenerary2 (LinkedList < String > list) {
            System.out.println("Trip starts at " + list.getFirst());
            String previousTown = list.getFirst();
            for (String town : list) {
                System.out.println("--> From: " +previousTown + " to " + town);
                System.out.println("Trip ends at " + list.getLast());
                previousTown = town;
            }
        }
    public static void printItenerary3 (LinkedList < String > list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();

            System.out.println("--> From: " + previousTown + " to " + town);
            System.out.println("Trip ends at " + list.getLast());
            previousTown = town;
        }
    }
        public static void testIterator(LinkedList<String> list) {
var iterator = list.listIterator();
while (iterator.hasNext()) {
//    System.out.println(iterator.next());
    if (iterator.next().equals("Brisbane")) {
        iterator.add("Lake Wivenhoe");
    }
}
    while (iterator.hasPrevious()) {
        System.out.println(iterator.previous());
    }
            System.out.println(list);

var iterator2 = list.listIterator(3);
System.out.println(iterator2.next());

    }
    }


