package kpi.laba2;

import java.util.Comparator;

public class SortByAnimalBreed implements Comparator<Zoo> {
    @Override
    public int compare( Zoo o1, Zoo o2 ) {
        String n1=o1.animalBreed;
        String n2=o2.animalBreed;
        return n1.compareTo(n2);
    }
}
