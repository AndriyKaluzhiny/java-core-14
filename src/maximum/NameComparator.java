package maximum;

import ua.lviv.lgs.Car;

import java.util.Comparator;

public class NameComparator implements Comparator<Commodity> {
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        }
        return 0;
    }
}
