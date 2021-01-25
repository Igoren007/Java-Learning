package com.homework;

public class DepositService {
    public void deposit(Account account, int money) {
       Bill bill = account.getBill();
       int currentBillAmount = bill.getAmount();
       System.out.println("Происходит пополнение счета, текущее значение счета: " + currentBillAmount);
       bill.setAmount(currentBillAmount + money);
       System.out.println("Пополнение счета завершено, новое значение счета: " + bill.getAmount());
    }
}
