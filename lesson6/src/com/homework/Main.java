package com.homework;

public class Main {
    public static void main(String[] args) {

        Person Igor = new Person("Igor", "Garmatenko", "0992514734");
        Bill igorBill = new Bill(15000);
        Account igorAccount = new Account(igorBill, Igor);

        Person Jon = new Person("Jon", "Bond", "0712234734");
        Bill jonBill = new Bill(25000);
        Account jonAccount = new Account(jonBill, Jon);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(igorAccount, 2000);
        paymentService.pay(jonAccount, 5000);

        DepositService depositService = new DepositService();
        depositService.deposit(igorAccount, 500);
        depositService.deposit(jonAccount, 1500);

        TransferService transferService = new TransferService();
        transferService.transfer(igorAccount, jonAccount, 99999);

    }
}
