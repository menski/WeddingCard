public class WeddingCard {

    public static void main(String[] pArgs) {
        String[] lCongratulants = {
            "Bettina Schnor",
            "Steffen Christgau",
            "Simon Kiertscher",
            "Sven Schindler",
            "Sebastian Menski",
            "Sebastian Fudickar",
            "Klemens Kittan",
        };
        Person lJoerg = new Person("Jörg", "Zinke", Gender.MALE);
        Person lUlla = new Person("Ulrike", "Jung", Gender.FEMALE);

        try {
            lJoerg.marriage(lUlla, "Jung");
        } catch (AlreadyMarriedException lE) {
            System.err.print(lE.getMessage());
        }

        lJoerg.congratulate(lCongratulants);
    }
}
