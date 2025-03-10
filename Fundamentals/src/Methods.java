public class Methods {
    public static void main(String[] args) {
        System.out.println(calculateAge(1999));

        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(25));
    }

    public static int calculateAge(int birthYear) {
        return 2025 - birthYear;
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}

/**
 * Fundamentals.Methods
 * method signature, parameters, arguments, method overloading
 *
 * Method overloading = parameters names and return types do NOT determine whether method signatures are unique
 */
