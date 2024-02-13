package org.zerock.kra20240208;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
public class TodoVO {

    private int tno;
    private String name;
    private String id;
    private String password;
    private int age;
    private String gender;
    private String[] hobbies;
    private String[] travel;
    private String content;
}
