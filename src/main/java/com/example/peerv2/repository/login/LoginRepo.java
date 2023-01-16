package com.example.peerv2.repository.login;

import com.example.peerv2.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginRepo {

    UserDto getUserInfoById(String user_email);

    UserDto findMember(int user_num);
}
