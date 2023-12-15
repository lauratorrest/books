package com.api.books.infrastructure.api.dto.response.account;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountDetailedResponse {
  private String userPictureUrl;
  private String profileName;
  private String fullName;
  private String email;
  private LocalDateTime createdDate;
  private LocalDateTime updatedDate;
}
