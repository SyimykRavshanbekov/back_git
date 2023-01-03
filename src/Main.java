import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();

        String operation = "null";

        while (!operation.equals("x")) {
            System.out.println("---------------------------------------------");
            System.out.println("1 - Положить деньги");
            System.out.println("2 - Увидеть остаток на счете");
            System.out.println("3 - Снять деньги с счета");

            operation = scanner1.nextLine();

            switch (operation) {
                case "1" -> bankAccount.deposit(scanner2.nextDouble());
                case "2" -> System.out.println(bankAccount.getAmount());
                case "3" -> bankAccount.withDraw(scanner2.nextInt());
                default -> System.out.println("Введите только 1, 2, 3");
            }
        }
    }
}