package com.example.expenseTracker.service;

import com.example.expenseTracker.entity.Expense;
import com.example.expenseTracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//public interface ExpenseService {
//
//    List<Expense> getAllExpenses();
//    Expense getExpenseById(Long id);
//    Expense createExpense(Expense expense);
//    Expense updateExpense(Long id, Expense expense);
//    void deleteExpense(Long id);
//
//    //---Custom query methods---//
//
//    List<Expense> getExpenseByCategory(String category);
//    List<Expense> getExpenseBetweenDates(LocalDate start, LocalDate end);
//}

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense getExpenseById(Long id) {
        return repository.findById(id);
    }
}