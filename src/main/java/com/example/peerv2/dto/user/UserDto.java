package com.example.peerv2.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class UserDto {

    private int user_num;
    private String user_email;

    @JsonIgnore
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
