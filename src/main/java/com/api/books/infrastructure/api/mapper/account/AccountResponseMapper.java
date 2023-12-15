package com.api.books.infrastructure.api.mapper.account;

import com.api.books.domain.entity.Account;
import com.api.books.infrastructure.api.dto.response.account.AccountResponse;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface AccountResponseMapper {
  AccountResponse toResponse(Account account);
  List<AccountResponse> toResponse(List<Account> accounts);
}
