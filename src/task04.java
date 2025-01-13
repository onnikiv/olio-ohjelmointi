public class task04 {
    private String name;

    public task04(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {

        task04 cat = new task04("Whiskers");
        task04 cat2 = new task04("Rex");

        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}