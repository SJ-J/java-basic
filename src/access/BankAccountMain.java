package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        System.out.println("현재 잔액은 " + ba.getBalance() + "원입니다.");
        ba.deposit(0);
        ba.deposit(8000000);
        ba.withdraw(-100000);
        ba.withdraw(100000);
        ba.withdraw(8000000);
        ba.deposit(1000000000);
    }
}
