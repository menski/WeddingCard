public class WeddingCard {

    public static void main(String[] args) {
        String[] congratulants = {"Bettina Schnor", "Steffen Christgau", "Simon Kiertscher", "Sven Schindler", "Sebastian Menski"};
        Person joerg = new Person("Jörg", "Zinke", Gender.MALE);
        Person ulla = new Person("Ulrike", "Jung", Gender.FEMALE);

        try {
            joerg.marriage(ulla, "Jung");
        } catch (AlreadyMarriedException e) {
            System.err.print(e.getMessage());
        }

        joerg.congratulate(congratulants);
    }
}
