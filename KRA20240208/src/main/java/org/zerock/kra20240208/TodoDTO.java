package org.zerock.kra20240208;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

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
