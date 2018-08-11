package com.soo.shop.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JacksonXmlRootElement(localName = "member")//spring 과 상관없는 third party.. 소문자로 xml 출력
public class Member {
    private Long id;
    private String name;
    private String email;

    //setter, getter 이런 메소드를 프로퍼티라고하고 set을 빼고 앞글자를 소문자로 바꾸면 프로퍼티명이된다.
}
