package com.api.books.infrastructure.repository.comment;

import com.api.books.infrastructure.repository.account.AccountDto;
import com.api.books.infrastructure.repository.paragraph.ParagraphDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "COMMENT")
public class CommentDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "comment_content")
  private String content;
  @ManyToOne
  @JoinColumn(name = "account_id", referencedColumnName = "id")
  private AccountDto account;
  @ManyToOne
  @JoinColumn(name = "paragraph_id", referencedColumnName = "id")
  private ParagraphDto paragraph;
  @Column(name = "created_date")
  private LocalDateTime createdDate;
}
