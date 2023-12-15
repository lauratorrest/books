package com.api.books.infrastructure.repository.account;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<AccountDto,Long> {
  @Query("UPDATE AccountDto ad SET ad.userPictureUrl = :userPictureUrl, ad.profileName = :profileName, "
      + "ad.fullName = :fullName, ad.email = :email, ad.updatedDate = :updatedDate "
      + "WHERE ad.id = :id")
  @Modifying
  void update(Long id, String userPictureUrl, String profileName, String fullName,
      String email, LocalDateTime updatedDate);
}
