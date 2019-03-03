package com.sklmxf.graduation.platform.dao;

import com.sklmxf.graduation.platform.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserOperatorDao {
    @Select("select email,name from user where email = #{email}")
    @Results({
            @Result(column = "email", property = "email"),
            @Result(column = "name", property = "userName")
    })
    User getUserInfo(@Param("email") String email);
    @Insert("insert into user (email,name) values(#{email},#{userName})")
    void addUser(@Param("email") String email,
                 @Param("userName") String userName);
}
