package task04;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Whiskers");
        Cat cat2 = new Cat("Rex");

        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}