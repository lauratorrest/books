package com.api.books.infrastructure.api.controller;

import com.api.books.application.account.AccountGetApplication;
import com.api.books.application.account.AccountSaveApplication;
import com.api.books.application.account.AccountUpdateApplication;
import com.api.books.infrastructure.api.dto.request.account.AccountCreateRequest;
import com.api.books.infrastructure.api.dto.request.account.AccountUpdateRequest;
import com.api.books.infrastructure.api.dto.response.account.AccountDetailedResponse;
import com.api.books.infrastructure.api.dto.response.account.AccountResponse;
import com.api.books.infrastructure.api.mapper.account.AccountCreateRequestMapper;
import com.api.books.infrastructure.api.mapper.account.AccountDetailedResponseMapper;
import com.api.books.infrastructure.api.mapper.account.AccountResponseMapper;
import com.api.books.infrastructure.api.mapper.account.AccountUpdateRequestMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountController {
  private final AccountGetApplication accountGetApplication;
  private final AccountSaveApplication accountSaveApplication;
  private final AccountUpdateApplication accountUpdateApplication;

  private final AccountResponseMapper accountResponseMapper;
  private final AccountDetailedResponseMapper accountDetailedResponseMapper;
  private final AccountCreateRequestMapper accountCreateRequestMapper;
  private final AccountUpdateRequestMapper accountUpdateRequestMapper;

  @GetMapping
  public ResponseEntity<List<AccountResponse>> getAllAccounts(){
    return ResponseEntity.ok(accountResponseMapper.toResponse(accountGetApplication.getAll()));
  }

  @GetMapping("/{id}")
  public ResponseEntity<AccountDetailedResponse> getAllAccounts(@PathVariable("id") Long id){
    return ResponseEntity.ok(accountDetailedResponseMapper.toResponse(accountGetApplication.getById(id)));
  }

  @PostMapping
  public ResponseEntity<AccountResponse> saveAccount(@RequestBody AccountCreateRequest accountCreateRequest){
    return ResponseEntity.ok(accountResponseMapper.toResponse(
        accountSaveApplication.saveAccount(accountCreateRequestMapper.toEntity(accountCreateRequest))
    ));
  }

  @PutMapping
  public void updateAccount(@RequestBody AccountUpdateRequest accountUpdateRequest){
    accountUpdateApplication.updateAccount(accountUpdateRequestMapper.toEntity(accountUpdateRequest));
  }

}
