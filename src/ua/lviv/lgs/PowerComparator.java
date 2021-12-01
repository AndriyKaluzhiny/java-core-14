package ua.lviv.lgs;

import java.util.Comparator;

public class PowerComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getPower() == o2.getPower()) {
            return 0;
        }
        if (o1.getPower() > o2.getPower()) {
            return 1;
        } else {
            return -1;
        }
    }
}