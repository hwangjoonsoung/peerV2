package com.example.peerv2.serive.member;

import com.example.peerv2.dto.user.GetUserDto;
import com.example.peerv2.dto.user.JoinUserDto;

public interface MemberService {

    default GetUserDto insertMember(JoinUserDto userdto) {
        return null;
    }

    default void fetchMember(JoinUserDto userdto) {
    }

    default void  deleteMember(JoinUserDto joinUserDto){

    }

}
