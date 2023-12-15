package com.api.books.infrastructure.repository.account;

import com.api.books.domain.entity.Account;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface AccountMapper {
  Account toEntity(AccountDto accountDto);
  List<Account> toEntity(List<AccountDto> accountDto);
  AccountDto toDto(Account account);
}
