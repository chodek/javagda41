package zwierzeta;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> lista = Arrays.asList("alalalala", "ala", "adadada");
        int a = 5;


        lista.sort((str1, str2) -> {
                    System.out.println(a);
                    return Integer.compare(str2.length(), str1.length());
                }
        );


        // lista.stream().
    }
}
