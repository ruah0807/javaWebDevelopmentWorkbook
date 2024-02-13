package org.zerock.test0807.domain;

import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {

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
