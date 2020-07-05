package adnotacje;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {





        Person one = new Person(15, "Janqweqeqeqeqeqw", "Wowalskiasdasdads");
        Person two = new Person(15, "Adam", "Małysz");
        Person three = new Person(27, "Joanna", "Nowak");


        List<Person> listOfPersons = Arrays.asList(one, two, three);

        MojKomparator mk = new MojKomparator();



        Collections.sort(listOfPersons,mk);

        System.out.println(listOfPersons);


    }
}
