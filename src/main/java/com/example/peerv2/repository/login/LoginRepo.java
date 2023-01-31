package com.example.peerv2.repository.login;

import com.example.peerv2.dto.user.GetUserDto;
import com.example.peerv2.dto.user.JoinUserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginRepo {

    JoinUserDto getUserInfoById(String user_email);

    GetUserDto findMember(int user_num);

    List<GetUserDto> findMemberAll();
}
