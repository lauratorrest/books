package com.api.books.application.account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountSaveService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountSaveApplicationTest {
  @Mock
  private AccountSaveService accountSaveService;
  @InjectMocks
  private AccountSaveApplication accountSaveApplication ;

  @Test
  void saveAccount() {
    Account expected = new Account();

    when(accountSaveService.saveAccount(expected)).thenReturn(expected);

    Account actual = accountSaveApplication.saveAccount(expected);
    assertEquals(expected,actual);
  }
}