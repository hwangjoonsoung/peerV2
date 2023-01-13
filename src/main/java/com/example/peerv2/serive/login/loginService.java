package com.example.peerv2.serive.login;

import com.example.peerv2.dto.user.userDto;

public interface loginService {

    void insertMember(userDto userdto);

    void testPassword(String user_id, String user_pass);
}
