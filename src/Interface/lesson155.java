package Interface;

public class lesson155 {
    public static void main(String[] args) {


        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

Parrot parrot = new Parrot ("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Pinguin penguin = new Pinguin ("Emperor penguin");
        penguin.fly();

    }
}