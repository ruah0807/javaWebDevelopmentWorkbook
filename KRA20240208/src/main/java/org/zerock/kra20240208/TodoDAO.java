package org.zerock.kra20240208;

import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class TodoDAO {

    public void insert(TodoVO vo) throws Exception {

        String sql = "insert into testmember (name, id, password, age, gender, hobbies, travel, content) " +
                "values (?,?,?,?,?,?,?,?)";

        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, vo.getName());
        preparedStatement.setString(2, vo.getId());
        preparedStatement.setString(3, vo.getPassword());
        preparedStatement.setInt(4, vo.getAge());
        preparedStatement.setString(5, vo.getGender());
        preparedStatement.setString(6, Arrays.toString(vo.getHobbies()));
        preparedStatement.setString(7, Arrays.toString(vo.getTravel()));
        preparedStatement.setString(8, vo.getContent());

        preparedStatement.executeUpdate();
    }
}
