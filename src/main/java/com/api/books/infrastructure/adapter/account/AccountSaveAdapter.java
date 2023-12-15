package com.api.books.infrastructure.adapter.account;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountSaveService;
import com.api.books.infrastructure.repository.account.AccountMapper;
import com.api.books.infrastructure.repository.account.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountSaveAdapter implements AccountSaveService {
  private final AccountRepository accountRepository;
  private final AccountMapper accountMapper;

  @Override
  public Account saveAccount(Account account) {
    return accountMapper.toEntity(accountRepository.save(accountMapper.toDto(account)));
  }
}
