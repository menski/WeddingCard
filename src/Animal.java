public abstract class Animal {
    private Gender mGender;
    private String mSpecies;

    public Animal(Gender pGender, String pSpecies) {
        this.mGender = pGender;
        this.mSpecies = pSpecies;
    }

    public Gender getGender() {
        return mGender;
    }

    public String getSpecies() {
        return mSpecies;
    }

}
