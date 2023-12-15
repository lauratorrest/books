package com.api.books.infrastructure.adapter.account;

import com.api.books.domain.entity.Account;
import com.api.books.domain.service.account.AccountGetService;
import com.api.books.infrastructure.repository.account.AccountDto;
import com.api.books.infrastructure.repository.account.AccountMapper;
import com.api.books.infrastructure.repository.account.AccountRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountGetAdapter implements AccountGetService {
  private final AccountRepository accountRepository;
  private final AccountMapper accountMapper;

  @Override
  public Account getById(Long id) {
    Optional<AccountDto> accountDto = accountRepository.findById(id);
    return accountDto.map(accountMapper::toEntity).orElseThrow(RuntimeException::new);
  }

  @Override
  public List<Account> getAll() {
    return accountMapper.toEntity(accountRepository.findAll());
  }
}
