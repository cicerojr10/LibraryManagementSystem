package com.example.library.controller;

import com.example.library.model.Loan;
import com.example.library.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> findAll() {
        return loanService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Loan> findById(@PathVariable Long id) {
        return loanService.findById(id);
    }

    @PostMapping
    public Loan save(@RequestBody Loan loan) {
        return loanService.save(loan);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        loanService.deleteById(id);
    }
}
