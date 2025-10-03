package com.example.expenseTracker.repository;

import com.example.expenseTracker.entity.Expense;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;

@Repository
public class ExpenseRepository   {

    private List<Expense> expenses;

    public ExpenseRepositry(){
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream inputStream = getClass().getResourceAsStream("/mock/expenses.json")) {
            expenses = mapper.readValue(inputStream, new TypeReference<List<Expense>>() {
            });
        } catch (IOException e) {
            throw new RunTimeException("Failed to load mock data", e);
        }
    }
    public List<Expense> findAll() {
        return expenses;
    }

    public Expense findById(Long id) {
        return expenses.stream()
                .filter(expense -> expense.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


}
