public class VariablesAndDataTypes {
    /**
     * Primitive types
     * Whole number: byte < short < int* < long
     * Decimal: float < double*
     * Single character: char
     * Boolean: boolean
     * .
     * Corresponding wrapper classes are title-cased and spelt out
     *
     */


    public static void main(String[] args) {
        // Integer is a wrapper class
        System.out.println("Integer Minimum Value = " + Integer.MIN_VALUE);
        System.out.println("Integer Maximum Value = " + Integer.MAX_VALUE);

        // Casting
        int x = 35;
        System.out.println("x = " + (double) x);

        // Boolean operators: && , ||
        // Ternary operator

        String car = "Lexus";
        boolean isDomestic = (car != "Lexus");

        if (!isDomestic)
            System.out.println(car + " is made in Japan.");

        int age = 20;
        String ageText = age >= 18 ? "Adult" : "Minor";
        System.out.println("Client is a " + ageText);
    }
}
