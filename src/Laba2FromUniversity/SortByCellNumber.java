package Laba2FromUniversity;

import java.util.Comparator;

public class SortByCellNumber implements Comparator<Zoo> {
    @Override
    public int compare( Zoo o1, Zoo o2 ) {
       String n1=o1.cellNumber;
        String n2=o2.cellNumber;
        return n1.compareTo(n2);
    }
    }


