package com.example.expensetracker.cli;

import com.example.expensetracker.manager.ExpenseManager;
import com.example.expensetracker.model.Expense;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();

        // tilføje et par udgifter
        manager.add(new Expense(LocalDate.now(), "Mad", 59.5, "Kaffe"));
        manager.add(new Expense(LocalDate.now(), "Transport", 23.0, "Busbillet"));

        for(Expense e : manager.listByCategory("Mad")){
            System.out.println(e);
        }

        System.out.println("Total: " + manager.getTotalAmount());


    }
}
