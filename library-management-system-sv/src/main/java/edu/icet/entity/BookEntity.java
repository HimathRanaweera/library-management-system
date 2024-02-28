package edu.icet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookEntity {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;

}
