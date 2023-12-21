package com.api.books.infrastructure.adapter.account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Account;
import com.api.books.infrastructure.repository.account.AccountDto;
import com.api.books.infrastructure.repository.account.AccountMapper;
import com.api.books.infrastructure.repository.account.AccountRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountGetAdapterTest {
  @Mock
  private AccountRepository accountRepository;
  @Mock
  private AccountMapper accountMapper;
  @InjectMocks
  private AccountGetAdapter accountGetAdapter;

  @Test
  void getById() {
    Account expected = new Account();
    AccountDto dto = new AccountDto();

    when(accountRepository.findById(1L)).thenReturn(Optional.of(dto));
    when(accountMapper.toEntity(dto)).thenReturn(expected);

    Account actual = accountGetAdapter.getById(1L);

    assertEquals(expected,actual);
  }

  @Test
  void getByIdWithException(){
    assertThrows(RuntimeException.class,
        () -> accountGetAdapter.getById(1L));
  }

  @Test
  void getAll() {
    List<Account> expected = new ArrayList<>();
    List<AccountDto> dtos = new ArrayList<>();

    when(accountRepository.findAll()).thenReturn(dtos);
    when(accountMapper.toEntity(dtos)).thenReturn(expected);

    List<Account> actual = accountGetAdapter.getAll();

    assertEquals(expected,actual);
  }
}