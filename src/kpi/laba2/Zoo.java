package kpi.laba2;

public class Zoo {
    public String name;
    public String animalBreed;
    int cellNumber;

    public Zoo( String name, String animalBreed, int cellNumber ) {
        this.name = name;
        this.animalBreed = animalBreed;
        this.cellNumber = cellNumber;
    }

    public String getName() {
        return name;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setAnimalBreed( String animalBreed ) {
        this.animalBreed = animalBreed;
    }

    public void setCellNumber( int cellNumber ) {
        this.cellNumber = cellNumber;
    }
}
