package access;

public class BankAccount {

    private int balance;    // 잔액
    public BankAccount() {
        this.balance = 0;
    }

    // public method: deposit
    public void deposit(int amount) {
        if ( isAmountValid(amount) ) {
            balance += amount;
            System.out.println("현재 잔액은 " + getBalance() + "원입니다.");
        } else {
            System.out.println("0원 이상의 금액을 입력해 주세요.");
        }
    }
    // public method: withdraw
    public void withdraw(int amount) {
        if ( isAmountValid(amount) && balance - amount >= 0 ) {
            balance -= amount;
            System.out.println("현재 잔액은 " + getBalance() + "원입니다.");
        } else if ( !isAmountValid(amount) ) {
            System.out.println("0원 이상의 금액을 입력해 주세요.");
        } else if ( balance - amount <= 0 ) {
            System.out.println("잔액이 부족합니다.");
        }
    }
    // public method: getBalance
    public int getBalance() {
        return balance;
    }
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
