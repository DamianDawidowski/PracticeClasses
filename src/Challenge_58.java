public class Challenge_58 {
    public static void main(String[] args) {
        char l = 'z';

        switch (l) {
            case 'A' -> System.out.println("A = Able");
            case 'B' -> System.out.println("B = Baker");
            case 'C' -> System.out.println("C = Charlie");
            case 'D' -> System.out.println("D = Dog");
            case 'E' -> System.out.println("E = Easy");
            default -> System.out.println("'" + l + "'" + " letter not found");
        }

    }

}

