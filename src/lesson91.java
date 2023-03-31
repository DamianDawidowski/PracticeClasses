public class lesson91 extends  Object {

    public static void main(String[] args) {
        Student1 max = new Student1("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8 , "Carole" );
        System.out.println(jimmy);

}}

class Student1 {
    private String name;
    private int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student1{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student1 {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }


    @Override
    public String toString() {
        return parentName + "'s kid, " +super.toString();
    }
}


