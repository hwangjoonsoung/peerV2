package com.example.peerv2.repository.member;

import com.example.peerv2.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepo {

    void insertMember(UserDto userdto);

    void fetchMember(UserDto userdto);

    void deleteMember(UserDto userdto);

}
