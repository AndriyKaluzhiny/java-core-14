package ua.lviv.lgs;

import java.util.HashSet;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        HashSet<Car> hs = new HashSet<>();
        hs.add(new Car("Audi", 520));
        hs.add(new Car("Mercedes", 500));
        hs.add(new Car("Mazda", 350));
        hs.add(new Car("Lamborghini", 650));

        TreeSet<Car> ts = new TreeSet<Car>(new PowerComparator());

        ts.addAll(hs);

        System.out.println("Before sorting(Power): ");

        for (Object o: hs) {
            System.out.println(o);
        }

        System.out.println();

        System.out.println("After sorting(Power): ");

        for (Object o: ts) {
            System.out.println(o);
        }

        TreeSet<Car> ts2 = new TreeSet<>(new NameComparator());

        ts2.addAll(hs);

        System.out.println();

        System.out.println("Before sorting(Name): ");

        for (Object o: hs) {
            System.out.println(o);
        }

        System.out.println();

        System.out.println("After sorting(Name): ");

        for (Object o: ts2) {
            System.out.println(o);
        }
    }
}
