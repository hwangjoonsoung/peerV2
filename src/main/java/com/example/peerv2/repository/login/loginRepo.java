package com.example.peerv2.repository.login;

import com.example.peerv2.dto.user.userDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface loginRepo {

    void insertMember(userDto userdto);

    userDto getUserInfoById(String user_email);

}
