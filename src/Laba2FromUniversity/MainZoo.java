package Laba2FromUniversity;

import java.util.ArrayList;
import java.util.Collection;

public class MainZoo {
    public static void main( String[] args ) {
        ArrayList<Zoo> ar = new ArrayList<Zoo>();

        ar.add(new Zoo("Васька", "собака", 23));
        ar.add(new Zoo("Маркиз", "дикий кот", 5));
        ar.add(new Zoo("Тошка", "белка", 7));

        Collection.sort(ar, new SortByAnimalBreed());
        Collection.sort(ar, new SortByCellNumber());
        Collection.sort(ar, new SortByName());
    }
}
