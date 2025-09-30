package com.example.expenseTracker.service;

import com.example.expenseTracker.entity.Expense;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseService {

    List<Expense> getAllExpenses();
    Expense getExpenseById(Long id);
    Expense createExpense(Expense expense);
    Expense updateExpense(Long id, Expense expense);
    void deleteExpense(Long id);

    //---Custom query methods---//

    List<Expense> getExpenseByCategory(String category);
    List<Expense> getExpenseBetweenDates(LocalDate start, LocalDate end);
}
