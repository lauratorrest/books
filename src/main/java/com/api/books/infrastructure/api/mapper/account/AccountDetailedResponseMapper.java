package com.api.books.infrastructure.api.mapper.account;

import com.api.books.domain.entity.Account;
import com.api.books.infrastructure.api.dto.response.account.AccountDetailedResponse;
import org.mapstruct.Mapper;

@Mapper
public interface AccountDetailedResponseMapper {
  AccountDetailedResponse toResponse(Account account);
}
