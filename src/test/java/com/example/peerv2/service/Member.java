package com.example.peerv2.service;

import com.example.peerv2.dto.user.JoinUserDto;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Date;

//회원가입
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("회원가입")
@SpringBootTest
public class Member {


    @Test
    @DisplayName("회원 정보 입력 테스트")
    public void userInsertTest() {

        //given
        String user_email = "joonsoung1@naver.com";
        String user_pass = "test";
        String user_name = "황준성";
        String user_gender = "남";
        String user_phone = "010-1234-1234";
        String user_nickname = "test";
        int user_authority = 1;
        Date user_birth = Date.valueOf("1993-09-26");

        JoinUserDto userDto = JoinUserDto.builder().user_email(user_email).user_pass(user_pass).user_name(user_name).user_gender(user_gender).user_phone(user_phone).user_nickname(user_nickname).user_authority(user_authority).user_birth(user_birth).build();
        System.out.println("userDto : "+ userDto);
        //when
        MemberTest memberTest = new MemberTest();
        ResponseEntity<Object> objectResponseEntity = memberTest.isInsetSuccess(userDto);

        //then
        Assertions.assertEquals(objectResponseEntity.getStatusCode(), HttpStatus.OK);

    }

}
