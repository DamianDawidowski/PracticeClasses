public class Exercise87 {

    public static void main(String[] args) {

for (int i = 1; i <= 5;i++) {
    LPAStudent s = new LPAStudent("S92300" +i,
            switch (i) {
        case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            },
            "05/11/1985",
            "java Masterclass");
    System.out.println(s);
}
Student pojoStudent = new Student("S923006", "Ann",
        "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923006", "Bill",
                "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+", Java 0CP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ",Java 0CP Exam 829");


        System.out.println(pojoStudent.getName()+ " is taking " +pojoStudent.getClassList());
//        System.out.println(recordStudent.name()+ " is taking " +recordStudent.classList());
    }
}
