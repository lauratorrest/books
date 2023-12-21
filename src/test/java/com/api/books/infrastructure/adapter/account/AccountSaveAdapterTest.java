package com.api.books.infrastructure.adapter.account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.api.books.domain.entity.Account;
import com.api.books.infrastructure.repository.account.AccountDto;
import com.api.books.infrastructure.repository.account.AccountMapper;
import com.api.books.infrastructure.repository.account.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountSaveAdapterTest {
  @Mock
  private AccountRepository accountRepository;
  @Mock
  private AccountMapper accountMapper;
  @InjectMocks
  private AccountSaveAdapter accountSaveAdapter;

  @Test
  void saveAccount() {
    Account expected = new Account();
    AccountDto dto = new AccountDto();

    when(accountMapper.toDto(expected)).thenReturn(dto);
    when(accountRepository.save(dto)).thenReturn(dto);
    when(accountMapper.toEntity(dto)).thenReturn(expected);

    Account actual = accountSaveAdapter.saveAccount(expected);
    assertEquals(expected,actual);
  }
}