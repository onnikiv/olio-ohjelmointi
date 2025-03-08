package task1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private final String name;
    private final int age;
    private final String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int    getAge()  { return age;  }
    public String getName() { return name; }
    public String getCity() { return city; }
    
    @Override
    public String toString() {return name + ", " + age + ", " + city;}

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                        new Person("Jorma", 64, "Joensuu"), 
                        new Person("Asmo", 28, "Helsinki"),
                        new Person("Markku", 33, "Vantaa"),
                        new Person("Kalevi", 79, "Akaa"),
                        new Person("Seppo", 53, "Porvoo"),
                        new Person("Sampo", 32, "Helsinki")
        ));

        System.out.println("\nAlkuperäinen järjestys: ");
        persons.forEach(System.out::println);

        persons.sort(java.util.Comparator.comparing(Person::getAge));
        System.out.println("\nUusi järjestys -> nuorimmasta vanhimpaan");
        persons.forEach(System.out::println);

        // poistetaan vain jos kaupunki ei ole "Helsinki"
        persons.removeIf(person -> !person.getCity().equals("Helsinki"));
        System.out.println("\nPelkästään henkilöt paikasta:  Helsinki");
        persons.forEach(System.out::println);   
    }
}