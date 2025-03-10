public class CastingVariables {
    public static void main(String[] args) {
        int currentYear = 2025;
        String yobInput = "1999";

        int yob = Integer.parseInt(yobInput);
        System.out.println(currentYear - yob);

        String yobPartialInput = "22.5";
        double yobPartial = Double.parseDouble(yobPartialInput);
        System.out.println(yobPartial);
    }
}
