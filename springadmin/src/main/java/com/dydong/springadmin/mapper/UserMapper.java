package com.dydong.springadmin.mapper;

import com.dydong.springadmin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User queryUserByName(String username);
}
