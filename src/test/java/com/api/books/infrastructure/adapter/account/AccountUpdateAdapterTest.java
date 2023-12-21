package com.api.books.infrastructure.adapter.account;

import static org.mockito.Mockito.verify;

import com.api.books.domain.entity.Account;
import com.api.books.infrastructure.repository.account.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountUpdateAdapterTest {
  @Mock
  private AccountRepository accountRepository;
  @InjectMocks
  private AccountUpdateAdapter accountUpdateAdapter;

  @Test
  void updateAccount() {
    Account account = new Account();
    accountUpdateAdapter.updateAccount(account);
    verify(accountRepository).update(account.getId(), account.getUserPictureUrl(),
        account.getProfileName(), account.getFullName(), account.getEmail(),
        account.getUpdatedDate());
  }
}