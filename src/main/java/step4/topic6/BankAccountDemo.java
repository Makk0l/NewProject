package step4.topic6;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("23132", 50);
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());

        bankAccount.withdraw(200);
        System.out.println(bankAccount.getBalance());

        bankAccount.withdraw(120);
        System.out.println(bankAccount.getBalance());
    }
}
