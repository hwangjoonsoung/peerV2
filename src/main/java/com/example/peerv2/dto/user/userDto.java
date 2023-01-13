package com.example.peerv2.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class userDto {

    private int user_num;
    private String user_email;
    private String user_pass;
    private String user_name;
    private String user_gender;
    private int user_age;
    private String user_phone;
    private String user_nickname;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date user_rege;

    private String use_ny;
    private int user_authority;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date user_birth;

}
