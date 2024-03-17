package com.skrahaman;

public interface Purchase {
    Snack bought(int quantity);
    void restock(int quantity);
}
