package maximum;

import java.util.Comparator;

public class WidthComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWidth() == o2.getWidth()) {
            return 0;
        }
        if (o1.getWidth() > o2.getWidth()) {
            return 1;
        } else {
            return -1;
        }
    }
}
