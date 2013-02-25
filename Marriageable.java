public interface Marriageable {
    public Boolean isMarried();;
    public Person getSpouse();
    public void setSpouse(Person spouse);
    public void marriage(Person spouse, String familyname) throws AlreadyMarriedException;
    public void congratulate(String[] congratulants);
}
