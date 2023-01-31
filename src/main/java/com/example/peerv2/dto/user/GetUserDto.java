package com.example.peerv2.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Getter
@Setter
@ToString
@Alias("GetUserDto")
@Builder
public class GetUserDto {

    private String user_email;
    private String user_name;
    private String user_gender;
    private String user_phone;
    private String user_nickname;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date user_rege;
    private String use_ny;
    private int user_authority;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date user_birth;




}
