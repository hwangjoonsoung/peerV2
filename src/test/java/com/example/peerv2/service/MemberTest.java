package com.example.peerv2.service;

import com.example.peerv2.dto.PayLoad;
import com.example.peerv2.dto.user.JoinUserDto;
import org.springframework.http.ResponseEntity;

public class MemberTest {

    public ResponseEntity<Object> isInsetSuccess(JoinUserDto userDto){
        System.out.println(userDto);
        return ResponseEntity.ok(new PayLoad(userDto));
    }


}
