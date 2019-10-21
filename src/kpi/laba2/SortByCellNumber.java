package kpi.laba2;

import java.util.Comparator;

public class SortByCellNumber implements Comparator<Zoo> {
    @Override
    public int compare( Zoo o1, Zoo o2 ) {
        int n1=o1.cellNumber;
        int n2=o2.cellNumber;
        return Integer.compare(o1.cellNumber, o2.cellNumber);
    }
}


