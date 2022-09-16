import java.util.Comparator;

public class NobleComparator implements Comparator<Person> {
    int maxLenthSurname = 3;// предельное число частей фамилии, учитываемых в расчете знатности
    int first;
    int second;

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.countWord(o1.getSurname()) > maxLenthSurname) {
            first = maxLenthSurname;
        } else {
            first = o1.countWord(o1.getSurname());
        }
        if (o2.countWord(o2.getSurname()) > maxLenthSurname) {
            second = maxLenthSurname;
        } else {
            second = o2.countWord(o2.getSurname());
        }
        if (first - second != 0) {
            return first - second;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
