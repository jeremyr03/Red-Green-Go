package uk.ac.manchester.cs.comp33711.romannumerals;

public class RomanNumeral {

    private int denary;

    public RomanNumeral(int i) {
        denary = i;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        if(denary/10 >= 1){
            denary -= 10;
            result.append("X");
        }
        if (denary / 5 >= 1) {
            denary -= 5;
            result.append("V");
        }
        if (denary == 4) {
            result.append("IV");
        } else {
            result.append("I".repeat(Math.max(0, denary)));
        }

        return result.toString();
    }

}
