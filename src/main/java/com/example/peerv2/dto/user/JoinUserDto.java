package com.example.peerv2.dto.user;

import lombok.*;
import org.apache.ibatis.type.Alias;

import javax.validation.constraints.Email;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Alias("JoinUserDto")
public class JoinUserDto {

    @Email
    private String user_email;

    private String user_pass;
    private String user_name;
    private String user_gender;
    private String user_phone;
    private String user_nickname;
    private int user_authority;
    private Date user_birth;

    @Builder
    public JoinUserDto(String user_email, String user_pass, String user_name, String user_gender, String user_phone, String user_nickname, int user_authority, Date user_birth) {
        this.user_email = user_email;
        this.user_pass = user_pass;
        this.user_name = user_name;
        this.user_gender = user_gender;
        this.user_phone = user_phone;
        this.user_nickname = user_nickname;
        this.user_authority = user_authority;
        this.user_birth = user_birth;
    }
}
