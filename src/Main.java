import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person ivan = new Person("Ivan", "Sokolov", 28);
        Person lena = new Person("Elena", "Petrova-Zadunaiskaya", 76);
        Person andrei = new Person("Andrei", "Potemkin Tavricheskiy", 34);
        Person herr = new Person("Herr", "Schtadt Beerkin Bem", 4);
        Person van = new Person("Herr", "der kunzel brumbl schtain", 2);
        Person ion = new Person("Ion", "Ya", 16);


        people.add(ivan);
        people.add(lena);
        people.add(andrei);
        people.add(herr);
        people.add(ion);
        people.add(van);


        people.sort((o1, o2) -> {
            int maxLenthSurname = 3;// предельное число частей фамилии, учитываемых в расчете знатности
            int first;
            int second;
            if (o1.countWord() > maxLenthSurname) {
                first = maxLenthSurname;
            } else {
                first = o1.countWord();
            }
            if (o2.countWord() > maxLenthSurname) {
                second = maxLenthSurname;
            } else {
                second = o2.countWord();
            }
            if (first - second != 0) {
                return first - second;
            } else {
                return o1.getAge() - o2.getAge();
            }
        });
        people.forEach(System.out::println);

    }

}
