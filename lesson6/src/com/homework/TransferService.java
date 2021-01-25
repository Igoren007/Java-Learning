package com.homework;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int money) {
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();
        if (billFromAmount < money) {
            System.out.println("Платеж невозможен - недостаточно средств для перевода");
        } else {
            System.out.println("Происходит перевод средств с аккаунта " + accountFrom.getAccountPerson().getName() +
                    "на аккаунт " + accountTo.getAccountPerson().getName());
            accountFrom.getBill().setAmount(billFromAmount - money);
            accountTo.getBill().setAmount(billToAmount + money);
            System.out.println("Перевод успешно завершен.");
        }
    }
}
