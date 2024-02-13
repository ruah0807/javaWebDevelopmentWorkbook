package org.zerock.test0807.dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {

    private int tno;
    private String name;
    private String id;
    private String password;
    private int age;
    private Boolean gender;
    private String[] hobbies;
    private String[] travel;
    private String content;


}
