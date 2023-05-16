public class AbbreviationsMain {
    public static void main(String[] args) {

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("b.y.", "Bryce Young");
        abbreviations.addAbbreviation("roy.", "and will be the rookie of the year!");
        abbreviations.addAbbreviation("car.", "is a Carolina Panther");

        String text = "b.y. car. roy.";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}