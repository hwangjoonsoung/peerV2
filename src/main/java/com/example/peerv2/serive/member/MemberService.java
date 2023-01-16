package com.example.peerv2.serive.member;

import com.example.peerv2.dto.user.UserDto;

public interface MemberService {

    default void insertMember(UserDto userdto) {
    }

    default void fetchMember(UserDto userdto) {
    }

    default void  deleteMember(UserDto userDto){

    }

}
