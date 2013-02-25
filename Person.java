public class Person extends Animal implements Marriageable {

    private String firstname;
    private String lastname;
    private Boolean married;
    private Person spouse;

    public Person(String firstname, String lastname, Gender gender) {
        super(gender, "Homo sapiens");
        this.firstname = firstname;
        this.lastname = lastname;
        this.married = false;
        this.spouse = null;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean isMarried() {
        return married;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public void marriage(Person spouse, String familyname) throws AlreadyMarriedException {
        if (this.spouse != null) {
            throw new AlreadyMarriedException(String.format("Already married with %s %s", this.spouse.firstname, this.spouse.lastname));
        }
        setLastname(familyname);
        this.spouse = spouse;
        spouse.setLastname(familyname);
        spouse.spouse = this;
    }

    public void congratulate(String[] congratulants) {
        System.out.printf("Best Whises to %s and %s %s from\n", getFirstname(), spouse.getFirstname(), getLastname());
        for (String congratulant: congratulants) {
            System.out.printf("\t%s\n", congratulant);
        }
    }

}
