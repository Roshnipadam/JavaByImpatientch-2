package com.random.kafka.com.learn;

public class FifteenTest {
    public static void main(String[] args) {
        FifteenInvoice invoice = new FifteenInvoice();
        invoice.addItem("Solt", 1000, 0.2);
        invoice.addItem("Sugar", 2000, 1.1);
        invoice.printItem("Solt");
        invoice.printItem("Sugar");
        invoice.removeItem("Solt");
        invoice.printItem("Solt");
        invoice.removeItem("Solt");
    }
}
