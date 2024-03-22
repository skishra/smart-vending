package com.skrahaman;

public class Test {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine(3, 3, 2);

        vm1.restock(new Chips("Lays 1oz.", 0.99), 0, 0);
        System.out.println(vm1);
        vm1.restock(new Donut("Boston Creme", 0.99), 1, 0);
        System.out.println(vm1);

        vm1.vend(0, 0);
        System.out.println(vm1);

        vm1.restock(new Chips("Lays 1oz.", 0.99), 0, 0);
        System.out.println(vm1);
        vm1.restock(new Chips("Lays 1oz.", 0.99), 0, 0);
        System.out.println(vm1);
    }
}
