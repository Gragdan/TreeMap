import java.util.Comparator;

public class NobleComparator implements Comparator<Person> {
    int maxLenthSurname = 4;// предельное число частей фамилии, учитываемых в расчете знатности
    int first;
    int second;

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}
