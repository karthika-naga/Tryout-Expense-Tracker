package com.example.expenseTracker.repository;

import com.example.expenseTracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpenseRepository  extends JpaRepository<Expense,Long> {

    //---Custom query methods---//

    List<Expense> findByTitle(String title);
    List<Expense> findByCategory(String category);
    List<Expense> findByExpenseDateBetween(LocalDate start, LocalDate end);


}
