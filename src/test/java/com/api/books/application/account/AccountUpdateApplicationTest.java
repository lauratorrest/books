package com.api.books.application.account;

import static org.mockito.Mockito.verify;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountUpdateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountUpdateApplicationTest {
  @Mock
  private AccountUpdateService accountUpdateService;
  @InjectMocks
  private AccountUpdateApplication accountUpdateApplication;

  @Test
  void updateAccount() {
    Account account = new Account();
    accountUpdateApplication.updateAccount(account);
    verify(accountUpdateService).updateAccount(account);
  }
}