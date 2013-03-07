public interface Marriageable {
    public Boolean isMarried();
    public Person getSpouse();
    public void setSpouse(Person pSpouse);
    public void marriage(Person pSpouse, String pFamilyname) throws AlreadyMarriedException;
    public void congratulate(String[] pCongratulants);
}
