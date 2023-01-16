package com.example.peerv2.serive.login;

public interface LoginService {

    default void testPassword(String user_id, String user_pass) {
    }

}
