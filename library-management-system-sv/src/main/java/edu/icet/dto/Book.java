package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
  private Long id;
  private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;

}
