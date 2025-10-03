package com.example.expenseTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double amount;
    private String category;
    private LocalDate expenseDate;

    //---Getters and setters---
    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public LocalDate getExpenseDate(){
        return expenseDate;
    }

    public void setExpenseDate(LocalDate ExpenseDate){
        this.expenseDate = expenseDate;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
