package com.api.books.infrastructure.api.dto.request.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountCreateRequest {
  private String userPictureUrl;
  @NotNull
  private String profileName;
  private String fullName;
  private String email;
}
