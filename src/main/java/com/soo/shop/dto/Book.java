package com.soo.shop.dto;


import lombok.*;

//
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    //필드를 선어
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private int price;


}
