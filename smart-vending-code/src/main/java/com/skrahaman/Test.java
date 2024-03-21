package com.skrahaman;

public class Test {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine(4, 6);

        vm1.restock(new Chips("Lays 1oz.", 0.99), 0, 0);

        System.out.println(vm1.vend(0, 0));

        System.out.println(vm1);
    }
}
