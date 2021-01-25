package com.homework;

public class PaymentService {
    public void pay(Account account, int money) {
        Bill bill = account.getBill();
        if (bill.getAmount() < money) {
            System.out.println("Платеж невозможен - недостаточно средств");
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит платеж, текущее значение счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - money);
            System.out.println("Платеж завершен, новое значение счета: " + bill.getAmount());
        }
    }
}
