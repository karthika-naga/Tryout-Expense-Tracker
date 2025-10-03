//package com.example.expenseTracker.service;
//
//import com.example.expenseTracker.entity.Expense;
//import com.example.expenseTracker.repository.ExpenseRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Service
//public class ExpenseServiceImpl implements ExpenseService{
//
//    @Autowired
//    private ExpenseRepository expenseRepository;
//
//    @Override
//    public List<Expense> getAllExpenses() {
//        return expenseRepository.findAll();
//    }
//
//    @Override
//    public Expense getExpenseById(Long id) {
//        return expenseRepository.findById(id).orElse(null);
//    }

//    @Override
//    public Expense createExpense(Expense expense) {
//        return expenseRepository.save(expense);
//    }
//
//    @Override
//    public Expense updateExpense(Long id, Expense expense) {
//        expense.setId(id);
//        return expenseRepository.save(expense);
//    }
//
//    @Override
//    public void deleteExpense(Long id) {
//        expenseRepository.deleteById(id);
//    }
//
//    @Override
//    public List<Expense> getExpenseByCategory(String category) {
//        return expenseRepository.findByCategory(category);
//    }
//
//    @Override
//    public List<Expense> getExpenseBetweenDates(LocalDate start, LocalDate end) {
//        return expenseRepository.findByExpenseDateBetween(start,end);
//    }
//}
