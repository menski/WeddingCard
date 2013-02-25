public abstract class Animal {
    private Gender gender;
    private String species;

    public Animal(Gender gender, String species) {
        this.gender = gender;
        this.species = species;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSpecies() {
        return species;
    }

}
