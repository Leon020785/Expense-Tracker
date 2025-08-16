package com.example.expensetracker.manager;

import com.example.expensetracker.model.Expense;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void add(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> listAll() {
        return Collections.unmodifiableList(expenses);
    }

    public double getTotalAmount() {
        double sum = 0;
        for (Expense e : expenses) {
            sum += e.getAmount();
        }
        return sum;
    }

    public List<Expense> listByCategory(String category) {
        List<Expense> result = new ArrayList<>();

        // Looper over klassens eksisterende liste med alle udgifter
        for (Expense e : expenses) {
            if (e.getCategory().equals(category)) {
                result.add(e);
            }
        }

        // Returnerer en "read-only" liste
        return Collections.unmodifiableList(result);
    }
}
