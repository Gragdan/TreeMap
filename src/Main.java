import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person ivan = new Person("Ivan", "Sokolov", 28);
        Person lena = new Person("Elena", "Petrova-Zadunaiskaya", 76);
        Person andrei = new Person("Andrei", "Potemkin Tavricheskiy", 34);
        Person herr = new Person("Herr", "fon Gerr Schtadt Beerkin Bem", 4);
        Person van = new Person("Herr", "van der kunzel brumbl schtain", 2);
        Person ion = new Person("Ion", "Ya", 16);


        people.add(ivan);
        people.add(lena);
        people.add(andrei);
        people.add(herr);
        people.add(ion);
        people.add(van);

        Comparator nobility = new NobleComparator();
        Collections.sort(people, nobility);


        for ( Person p : people) {
            System.out.println(p.toString());
        }
    }
}
