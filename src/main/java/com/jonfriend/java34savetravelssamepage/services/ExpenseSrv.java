package com.jonfriend.java34savetravelssamepage.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.jonfriend.java34savetravelssamepage.models.ExpenseMdl;
import com.jonfriend.java34savetravelssamepage.repositories.ExpenseRpo;

@Service
public class ExpenseSrv {
	
	private final ExpenseRpo expenseRpo; 
	
	public ExpenseSrv(ExpenseRpo expenseRpo) {
		this.expenseRpo = expenseRpo;
	}
	
	public List<ExpenseMdl> allExpense() {
		return expenseRpo.findAll(); 
	}
	
	public ExpenseMdl createExpense(ExpenseMdl x) {
		return expenseRpo.save(x); 
	}
	
	
	public ExpenseMdl findExpense(Long id) {
		Optional<ExpenseMdl> optionalExpense = expenseRpo.findById(id); 
		if(optionalExpense.isPresent()) {
			return optionalExpense.get(); 
		} else {
			return null; 
		}
	}
// end srv
}
