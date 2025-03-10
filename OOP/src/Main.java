public class Main {
    public static void main(String[] args) {
//        Account account = new Account("12345",
//                1000.0,
//                "Bob Brown",
//                "email@bob.com",
//                "(555)555-5555");

        Account account = new Account("Time", "time@email.com", "12345");

        System.out.println(account.getNumber());
        System.out.println(account.getBalance());
    }
}
