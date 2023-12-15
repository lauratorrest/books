package com.api.books.infrastructure.adapter.account;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountUpdateService;
import com.api.books.infrastructure.repository.account.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class AccountUpdateAdapter implements AccountUpdateService {
  private final AccountRepository accountRepository;

  @Transactional
  @Override
  public void updateAccount(Account account) {
    accountRepository.update(account.getId(), account.getUserPictureUrl(), account.getProfileName(),
        account.getFullName(), account.getEmail(), account.getUpdatedDate());
  }
}
