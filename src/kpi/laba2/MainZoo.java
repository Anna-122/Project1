package kpi.laba2;

import java.util.ArrayList;
import java.util.Collections;

public class MainZoo {
    public static void main( String[] args ) {
        ArrayList<Zoo> ar = new ArrayList<Zoo>();

        ar.add(new Zoo("Васька", "собака", 23));
        ar.add(new Zoo("Маркиз", "дикий кот", 5));
        ar.add(new Zoo("Тошка", "белка", 7));

        Collections.sort(ar, new SortByAnimalBreed());
        Collections.sort(ar, new SortByCellNumber());
        Collections.sort(ar, new SortByName());
    }
}

