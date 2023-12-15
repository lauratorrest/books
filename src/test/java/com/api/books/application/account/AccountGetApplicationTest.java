package com.api.books.application.account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountGetService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountGetApplicationTest {
  @Mock
  private AccountGetService accountGetService;
  @InjectMocks
  private AccountGetApplication accountGetApplication;

  @Test
  void getById() {
    Account expected = new Account();

    when(accountGetService.getById(1L)).thenReturn(expected);

    Account actual = accountGetApplication.getById(1L);
    assertEquals(expected,actual);
  }

  @Test
  void getAll() {
    Account account = new Account();
    List<Account> expected = List.of(account);

    when(accountGetService.getAll()).thenReturn(expected);

    List<Account> actual = accountGetApplication.getAll();
    assertEquals(expected,actual);
  }
}