package com.hikex.service;

import com.hikex.model.Account;
import com.hikex.repository.AccountRepositoryImpl;

public class TransactionServiceImpl {

	public void trasfer(final double amount, final Long fromAccountId, final Long toAccountId) {

		System.out.println("trasferring amount : " + amount + " ,from : " + fromAccountId + " , to : " + toAccountId);

		AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
		Account fromAccount = accountRepository.getAccount(fromAccountId);
		Account toAccount = accountRepository.getAccount(toAccountId);

		fromAccount.setAmount(fromAccount.getAmount() - amount);
		toAccount.setAmount(toAccount.getAmount() + amount);

		accountRepository.updateAccount(toAccount);
		accountRepository.updateAccount(fromAccount);
	}

}
