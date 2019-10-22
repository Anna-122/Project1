package Laba2FromUniversity;

public class Zoo {
    public String name;
    public String animalBreed;
    String cellNumber;

    public Zoo( String name, String animalBreed, String cellNumber ) {
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

    public String getCellNumber() {
        return cellNumber;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setAnimalBreed( String animalBreed ) {
        this.animalBreed = animalBreed;
    }

    public void setCellNumber(String cellNumber ) {
        this.cellNumber = cellNumber;
    }
}
