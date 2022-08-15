package homework3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> a = new TreeSet<String>();
        a.add("x");
        a.add("y");
        a.add("z");
        a.add("h");
        a.add("j");

        Set<String> b = new TreeSet<String>();
        b.add("a");
        b.add("p");
        b.add("q");
        b.add("h");
        b.add("j");


        Set<String> intersection = new TreeSet<String>(a);
        Set<String> union = new TreeSet<String>(a);

        intersection.retainAll(b);
        union.addAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(intersection);
        System.out.println(union);


    }
}
