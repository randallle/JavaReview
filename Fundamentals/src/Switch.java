public class Switch {
    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3, 4, or 5");
                System.out.println("The value was " + switchValue);
            }
            default -> System.out.println("Was not in 1-5");
        }
    }
}
