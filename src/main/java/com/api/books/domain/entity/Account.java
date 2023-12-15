package com.api.books.domain.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
  private Long id;
  private String userPictureUrl;
  private String profileName;
  private String fullName;
  private String email;
  private LocalDateTime createdDate;
  private LocalDateTime updatedDate;
}
