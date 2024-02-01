package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account ac = new Account();
        // 10,000원 입금
        ac.deposit("deposit", 10000);
        // 9,000원 출금
        ac.deposit("withdraw", 9000);
        // 2,000원 출금
        ac.deposit("withdraw", 2000);
        // 잔액 확인
    }
}
