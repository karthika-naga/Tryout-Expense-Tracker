package com.example.expenseTracker.repository;

import com.example.expenseTracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ExpenseRepository  extends JpaRepository<Expense,Long> {

}
