package com.example.peerv2.repository.member;

import com.example.peerv2.dto.user.JoinUserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepo {

    void insertMember(JoinUserDto userdto);

    void fetchMember(JoinUserDto userdto);

    void deleteMember(JoinUserDto userdto);

}
