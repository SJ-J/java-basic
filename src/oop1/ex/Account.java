package oop1.ex;

public class Account {
    // 잔액
    int balance;

    int deposit(String status, int amount) {
        // 입금 시 잔액 증가
        if (status == "deposit") {
            balance += amount;
            System.out.println(amount + " 원을 입금했습니다. \n 잔액: " + balance);
        }
        // 출금 시 잔액 감소
        else if (status == "withdraw") {
            // 잔액 부족 시 안내문 출력
            if (balance < amount) {
                System.out.println("잔액이 부족합니다.");
            } else if (balance >= amount){
                balance -= amount;
                System.out.println(amount + " 원을 출금했습니다. \n 잔액: " + balance);
            }
        }
        return balance;
    }
}
