package com.api.books.infrastructure.api.mapper.account;

import com.api.books.domain.entity.Account;
import com.api.books.infrastructure.api.dto.request.account.AccountCreateRequest;
import org.mapstruct.Mapper;

@Mapper
public interface AccountCreateRequestMapper {
  Account toEntity(AccountCreateRequest accountCreateRequest);
}
