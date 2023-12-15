package com.api.books.infrastructure.api.dto.response.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountResponse {
  private Long id;
  private String userPictureUrl;
  private String profileName;
  private String fullName;
}
