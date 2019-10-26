package kpi.laba2;

import java.util.Comparator;

    public class SortByName implements Comparator<Zoo> {
        @Override
        public int compare( Zoo o1, Zoo o2 ) {
            String n1=o1.name;
            String n2=o2.name;
            return n1.compareTo(n2);
        }
        }

