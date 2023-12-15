package com.api.books.infrastructure.repository.paragraph;

import com.api.books.infrastructure.repository.chapter.ChapterDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PARAGRAPH")
public class ParagraphDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "paragraph_content")
  private String content;
  @ManyToOne
  @JoinColumn(name = "chapter_id", referencedColumnName = "id")
  private ChapterDto chapter;
  @Column(name = "order_sequence")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer orderSequence;
}
