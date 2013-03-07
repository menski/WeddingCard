public class Person extends Animal implements Marriageable {

    private String mFirstname;
    private String mLastname;
    private Boolean mMarried;
    private Person mSpouse;

    public Person(String pFirstname, String pLastname, Gender pGender) {
        super(pGender, "Homo sapiens");
        this.mFirstname = pFirstname;
        this.mLastname = pLastname;
        this.mMarried = false;
        this.mSpouse = null;
    }

    public String getFirstname() {
        return mFirstname;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String pLastname) {
        this.mLastname = pLastname;
    }

    public Boolean isMarried() {
        return mMarried;
    }

    public Person getSpouse() {
        return mSpouse;
    }

    public void setSpouse(Person pSpouse) {
        this.mSpouse = pSpouse;
    }

    public void marriage(Person pSpouse, String pFamilyname) throws AlreadyMarriedException {
        if (getSpouse() != null) {
            throw new AlreadyMarriedException(String.format("Already married with %s %s", getSpouse().getFirstname(), getSpouse().getLastname()));
        }
        setLastname(pFamilyname);
        setSpouse(pSpouse);
        pSpouse.setLastname(pFamilyname);
        pSpouse.setSpouse(this);
    }

    public void congratulate(String[] pCongratulants) {
        System.out.printf("Best Whishes to %s and %s %s from\n", getFirstname(), getSpouse().getFirstname(), getLastname());
        for (String lCongratulant: pCongratulants) {
            System.out.printf("\t%s\n", lCongratulant);
        }
    }

}
