package org.zerock.test0807.dao;

import lombok.Cleanup;
import org.zerock.test0807.domain.TodoVO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TodoDAO {

    public void insert(TodoVO vo) throws Exception {

        String sql = "insert into tbl_member(name, id, password, age, gender, hobbies, travel, content) " +
                "values(?,?,?,?,?,?,?,?)";

        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);


        preparedStatement.setString(1, vo.getName());
        preparedStatement.setString(2, vo.getId());
        preparedStatement.setString(3, vo.getPassword());
        preparedStatement.setInt(4, vo.getAge());
        preparedStatement.setBoolean(5, vo.getGender());
        preparedStatement.setString(6,String.join(",", vo.getHobbies())); // 배열을 문자열로 변환하여 저장
        preparedStatement.setString(7, String.join(",", vo.getTravel()));
        preparedStatement.setString(8, vo.getContent());

        preparedStatement.executeUpdate();


    }


//    public List<TodoVO> selectAll() throws Exception {
//        String sql = "select * from tbl_member";
//
//        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
//        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        @Cleanup ResultSet resultSet = preparedStatement.executeQuery();
//
//        List<TodoVO> list = new ArrayList<>();
//
//        while (resultSet.next()) {
//            TodoVO vo = TodoVO.builder()
//                    .name(resultSet.getString("name"))
//                    .id(resultSet.getString("id"))
//                    .password(resultSet.getString("password"))
//                    .age(resultSet.getInt("age"))
//                    .gender(resultSet.getBoolean("gender"))
//                    .hobbies(new String[]{resultSet.getString("hobbies")})
//                    .travel(new String[]{resultSet.getString("travel")})
//                    .content(resultSet.getString("content"))
//                    .build();
//
//            list.add(vo);
//        }
//    return list;
//    }
}
