package com.example.expenseTracker.controller;

import com.example.expenseTracker.entity.Expense;
import com.example.expenseTracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/expense")

public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    //---Gets all expenses---//
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    //---Gets expense by id---//
    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable Long id) {
        return expenseService.getExpenseById(id);
    }

    //---Add new expense---//
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseService.createExpense(expense);
    }

    //---Updates an expense---//
    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense expense) {
        return expenseService.updateExpense(id,expense);
    }

    //---Deletes an expense---//
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
         expenseService.deleteExpense(id);
    }

    //---Gets expenses based on category---//
    @GetMapping("/category/{category}")
    public List<Expense> getExpenseByCategory(@PathVariable String category) {
        return expenseService.getExpenseByCategory(category);
    }

    //---Gets expenses over a timeline---//
    @GetMapping("/between")
    public List<Expense> getExpenseBetweenDates(@RequestParam LocalDate start,@RequestParam LocalDate end) {
        return expenseService.getExpenseBetweenDates(start,end);
    }



}
