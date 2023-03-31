import java.util.*;

public class Lesson135 {
    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("list: " + groceries);
        boolean isON = true;
        while (isON) {
            String Initial ="""
                    Enter numbers from 
                    0: shutdown 
                    1: to add item(s) to list(comma delimited list)
                    2 - to remove any items(comma delimited list)
                    Enter a number for which action you want to do: """;
            System.out.print(Initial+" ");
            String input = (scanner.nextLine());
            if (Objects.equals(input, "0")) {
                isON = false;
                System.out.println("shutdown");
            } else if (Objects.equals(input, "1")) {
                System.out.println("Enter item(s) to add");
                String input1 = (scanner.nextLine());
                String noSpaceinput1 = input1.replaceAll(" ", "");
                String[] seperatedInput = noSpaceinput1.split(",");
                for (int i = 0; i < seperatedInput.length; i++) {
                    if (groceries.contains(seperatedInput[i])) {
                        System.out.println("List already contains " + seperatedInput[i]);
                    } else {
                        groceries.add(seperatedInput[i]);

                    }
                }
//                List<String> anotherList = Arrays.asList(seperatedInput);

//                nextList.addAll(anotherList);
                groceries.sort(Comparator.naturalOrder());
                System.out.println(groceries);
            } else if (Objects.equals(input, "2")) {
                System.out.println("Enter item(s) to remove");
                String input2 = (scanner.nextLine());
                String noSpaceinput1 = input2.replaceAll(" ", "");
                String[] seperatedInput = noSpaceinput1.split(",");
                for (int i = 0; i < seperatedInput.length; i++) {
                    if (groceries.contains(seperatedInput[i])) {
                        System.out.println(seperatedInput[i] + " will be deleted from the list");
                        groceries.remove(seperatedInput[i]);
                    } else {
                        System.out.println(seperatedInput[i] + " is not on the list");
                    }


                    groceries.sort(Comparator.naturalOrder());
                    System.out.println(groceries);
                }
            }
        }
    }
}