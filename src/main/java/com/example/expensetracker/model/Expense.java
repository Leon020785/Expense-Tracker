package com.example.expensetracker.model;

import java.time.LocalDate;


public class Expense {
    private LocalDate date;
    private String category;
    private double amount;
    private String note;

public Expense(LocalDate date, String category, double amount, String note) {
    this.date = date;
    this.category = category;
    this.amount = amount;
    this.note = note;
}

public LocalDate getDate() {
    return date;
}
public String getCategory() {
    return category;
}
public double getAmount() {
    return amount;
}
public String getNote() {
    return note;
}
@Override
    public String toString() {
    return date + " " + category + " " + amount + " " + note;

}





}
